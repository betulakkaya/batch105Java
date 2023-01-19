package javaSorular;

import java.util.Scanner;

public class S1_IsimSyisimAyirma {

    /*
        Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
        ad ayrı soyad ayrı sekilde ekrana yazdırınız.
        input  : "AHMET YILMAZ"
        output : Ahmet
                 Yilmaz
     */

    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen adinizi ve soyadinizi yaziniz");

        String adSoyad= scan.nextLine();

        String ad= adSoyad.substring(0,adSoyad.indexOf(' '));
        String soyad= adSoyad.substring(adSoyad.indexOf(' ')+1);

        System.out.println("ad : " + ad +
                "\nsoyad :" + soyad);


    }
}

