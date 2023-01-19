package javaSorular;

import java.util.Scanner;

public class S4_KelimeninOrtasiniYazdirma {

     /*
    Tek sayida harf iceren bir String degiskenin ortasindaki harfi
    konsolda yazdirmak icin bir Java programi yaziniz.
    Eger kelime cift sayida harf iceriyorsa ortadaki 2 harfi yazdiran method create ediniz.
    ORNEK:
       INPUT  :  Python
       OUTPUT :  th
    */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir kelime giriniz : ");
        String girilenKelime = scan.next();
        System.out.println(ortadakiharfiYazdir(girilenKelime));

    }

    public static String ortadakiharfiYazdir (String girilenKelime) {

        int uzunluk= girilenKelime.length();
        int ortadakiIndex= uzunluk/2;
        int baslangicIndex = ortadakiIndex - 1;
        int bitisIndex = ortadakiIndex + 1;

        if (uzunluk %2 == 0) {
            return girilenKelime.substring(baslangicIndex,bitisIndex);
        }else
            return girilenKelime.substring(ortadakiIndex,ortadakiIndex+1);
    }
}
