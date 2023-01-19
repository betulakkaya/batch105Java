package javaSorular;

public class S6_IsimSoyisimBirlestirMethodu {
    public static void main(String[] args) {

        // kullanıcından iki isim ve soyismini alan ve sonra bunları birleştirip yazdıran bir method yapınız

        String isim= "Mehmet";
        String soyisim= "Aksoy";
        isimBirlestirme(isim,soyisim);

    }

    public static void isimBirlestirme (String isim,String soyisim){

        String tamIsim = isim+ " "+ soyisim;
        System.out.println(tamIsim);

    }
}
