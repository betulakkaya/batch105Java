package ders12_forLoops;

public class C05_DikkatEdilecekler {
    public static void main(String[] args) {

        /*  Sonsuz loop
        for (int i = 0; i >-10; i++) {
            System.out.print(i +" ");
        }
        */


        // ilk deger icin bitis sarti true olmuyorsa
        // for body'si hic devreye giremez
        for (int i = 0; i >10 ; i++) {

            System.out.println(i);
        }


        // bir loop'u sonunu beklemeden bitirmek istersek

        // kullanicinin verdigi bir sayinin asal sayi olup olmadigini bulun
        // asal sayi : 1 ve kendisi disinda hic bir tamsayiya tam bolunmeyen sayi

        int sayi=230;
        int bayrak=0;

        for (int i = 2; i <=sayi-1 ; i++) {

            if (sayi % i==0){
                // askimiz bitti
                bayrak++;
                break;
            }
        }


        System.out.println(bayrak);


        if (bayrak==0){
            System.out.println("asal sayi ");
        }else {
            System.out.println("asal sayi degil");
        }
    }
}
