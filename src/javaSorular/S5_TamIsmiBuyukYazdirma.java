package javaSorular;

import java.util.Scanner;

public class S5_TamIsmiBuyukYazdirma {
    public static void main(String[] args) {

        // kullanıcıdan ismini ve soy ismin sorun, bütün ismini büyük harf ile yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scan.nextLine();

        String tumAd= isim.toUpperCase() + " " + soyisim.toUpperCase();

        System.out.println(tumAd);
    }
}
