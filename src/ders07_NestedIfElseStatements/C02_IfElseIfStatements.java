package ders07_NestedIfElseStatements;

public class C02_IfElseIfStatements {
    public static void main(String[] args) {

        //Kullanicidan aldigi urun adedi ve liste fiyatini alin
        //kullaniciya musteri karti olup olmadigini sorun
        //Musteri karti varsa 10 urunden fazla alirsa %20, 10 urunden az ise %15 indirim yapin
        //Musteri karti yoksa 10 urunden fazla alirsa ½15, 10 urunden az ise %10 indirim yapib

        int urunAdedi=30;
        boolean kartVarMi= false;
        double listeFiyati=12.5;
        double toplamFiyat=0;

        if (kartVarMi==true && urunAdedi>=10){
            toplamFiyat= urunAdedi*listeFiyati*(0.8);
            System.out.println("%20 indirimli toplam fiyat:" + toplamFiyat);
        } else if (kartVarMi && urunAdedi<10 && urunAdedi>0) {
            toplamFiyat= urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
        } else if (!kartVarMi && urunAdedi>=10) {
            toplamFiyat= urunAdedi*listeFiyati*(0.85);
            System.out.println("%15 indirimli toplam fiyat:" + toplamFiyat);
        } else if (!kartVarMi && urunAdedi<10 && urunAdedi>10) {
            toplamFiyat=urunAdedi*listeFiyati*(0.9);
            System.out.println("%10 indirimli toplam fiyat:" + toplamFiyat);
        }else {
            System.out.println("Gecersiz giris");
        }
    }
}
