package ders06_IfElseStatements;

import java.util.Scanner;

public class C09_IfElseIfStatements {
    public static void main(String[] args) {

        // Kullanicidan bir tam sayi alin
        // sayi negatifse 'gecersiz sayi'
        // tek basamakli ise 'rakam'
        // iki basamakli ise 'iki basamakli sayi'
        // bunun disindaki sayilar icin 'buyuk sayi' yazdirin

        int sayi= 2;

        if (sayi<0){
            System.out.println("Gecersiz sayi");

        } else if (sayi<10) {
            System.out.println("rakam");

        } else if (sayi<100) {
            System.out.println("iki basamakli sayi");

        }else {
            System.out.println("buyuk sayi");
        }




    }
}
