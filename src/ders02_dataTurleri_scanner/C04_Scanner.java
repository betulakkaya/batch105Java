package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {


        // Kullanicidan ismini alip buyuk harlerle yazdirin

        // 1. adim scan objesi olusturmak
        Scanner scan= new Scanner(System.in);

        // 2.adim: kullaniciya ne istedigimizi yazdirmak

        System.out.println("Lutfen adinizi giriniz");

        // 3.adim: kullanicidan istedigimiz bilginin turune uygun bir variable olusturup
        //         scanner methodlarindan uygun olanini kullanarak alinana degeri variableye atayalim

        String kullaniciAdi= scan.next();

        System.out.println(kullaniciAdi.toUpperCase());



    }
}
