package ders08_ternary_switch;

import java.util.Locale;
import java.util.Scanner;

public class soruCozumu {
    public static void main(String[] args) {

       //Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise onu buyuk
       //harf olarak yazdirin, yoksa girilen harfi yazdirin


       // Scanner scan= new Scanner(System.in);
       // System.out.println("Lutfen bir harf giriniz");

       // char karakter= scan.next().charAt(0);

       // if (karakter >= 'a' && karakter <= 'z') {
       //     System.out.println((char) (karakter-32));

       // }else
       //     System.out.println(karakter);


        //Kullanicidan gun numarasini alip hafta ici veya hafta sonu yazdirin

        Scanner scan= new Scanner (System.in);

        System.out.println("Lutfen gun numarasini giriniz");

        int gunNo= scan.nextInt();

        switch (gunNo){
            case 1:
                System.out.println("Haftaiçi");
                break;
            case 2:
                System.out.println("Haftaiçi");
                break;
            case 3:
                System.out.println("Haftaiçi");
                break;
            case 4:
                System.out.println("haftaiçi");
                break;
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
                System.out.println("Haftasonu");
                break;
            case 7:
                System.out.println("Haftasonu");
            default:
                System.out.println("Girilen gun no yanlıs");
        }








    }
}
