import java.util.Scanner;
public class ucakBileti {
    public static void main(String[] args) {
        int yas, km, secim;
        double biletFiyati;
        Scanner inp = new Scanner(System.in);

        System.out.print("Gidilecek Mesafe : ");
        km = inp.nextInt();
        biletFiyati = km * 0.10;
        System.out.println("Bilet Fiyatı : " + biletFiyati);
        System.out.print("Yaşınız : ");
        yas = inp.nextInt();

        if ((yas < 0) || (km < 0)) {
            System.out.println("Hatalı Veri Girdiniz");
        }
        if (yas <= 12) {
            biletFiyati *= 0.5;
        } else if ((yas >= 12) && (yas <= 24)) {
            biletFiyati *= 0.9;
        }else if (yas>=65){
            biletFiyati *= 0.7;
        }System.out.println("İndirimli Bilet Fiyatı : " + biletFiyati);

        System.out.println("Yolculuk Tipini Seçiniz : \n 1-Tek Yön\n 2- Gidiş-Dönüş");
        System.out.print("Seçiminiz : ");
        secim = inp.nextInt();

        switch (secim){
            case 1:
                System.out.println("Toplam Tutar : " +biletFiyati); break;
            case 2:
                biletFiyati *= 0.8;
                System.out.println("Toplam Tutar :" +biletFiyati); break;
            default:
                System.out.println("Hatalı Sayı Girdiniz.");
        }
    }
}
