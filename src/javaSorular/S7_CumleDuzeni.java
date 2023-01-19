package javaSorular;

import java.util.Scanner;

public class S7_CumleDuzeni {
    public static void main(String[] args) {

         /*
        kullanıcıdan 4 kelime isteyin
        cümle düzenine göre yazdırın
        Örnek: Cümle düzeni bu şekilde.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime1= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime2= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime3= scan.nextLine();
        System.out.println("Lutfen bir kelime giriniz");
        String kelime4= scan.nextLine();

       String yeniKelime1=kelime1.substring(0,1).toUpperCase()+kelime1.substring(1).toLowerCase();
       String yeniKelime2= kelime2.toLowerCase();
       String yeniKelime3= kelime3.toLowerCase();
       String yeniKelime4= kelime4.toLowerCase()+".";

        System.out.println(yeniKelime1+" "+yeniKelime2+" "+ yeniKelime3+" "+yeniKelime4);

    }
}
