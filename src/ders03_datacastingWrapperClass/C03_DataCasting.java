package ders03_datacastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        //kullanicidan bir tam sayi alin
        //kullanici kac girerse girsin
        //konsolda -128 ile +127 arasinda bir sonuc yazdiracak
        //kod yaziniz

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen bir tam sayi giriniz");

        int girilenSayi= scan.nextInt();

        byte donusensayi= (byte)girilenSayi;

        System.out.println("girdiginiz"+ girilenSayi+ " 'nin donusmus hali:" + donusensayi);

    }
}
