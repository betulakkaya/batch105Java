package javaSorular;

import java.util.Scanner;

public class S3_GunIsmiYazma {
    public static void main(String[] args) {

        /*
         Kullanicidan gun numarasini alip
         gun ismini yazdiran bir program yazin.

         */

        Scanner scan = new Scanner (System.in);
        System.out.println("Lutfen gun giriniz");
        String girilenGun= scan.nextLine();
        girilenGun=girilenGun.toLowerCase();

        if (girilenGun.equals("pazartesi")){
            System.out.println("1");
        } else if (girilenGun.equals("sali")) {
            System.out.println("2");
        } else if (girilenGun.equals("carsamba")) {
            System.out.println("3");
        } else if (girilenGun.equals("persembe")) {
            System.out.println("4");
        } else if (girilenGun.equals("cuma")) {
            System.out.println("5");
        } else if (girilenGun.equals("cumartesi")) {
            System.out.println("6");
        } else if (girilenGun.equals("pazar")) {
            System.out.println("7");
        }else
            System.out.println("Yanlis gun girdiniz");


        System.out.println(girilenGun.toLowerCase());
    }



}
