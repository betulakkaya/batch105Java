package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1= "";
        // str1 'e deger atanmistir

        System.out.println(str1); // hiclik yazdirir
        System.out.println(str1.concat("Java")); // Java


        String str2;
        // str2 olusturuldu ama deger atanmadi

        // System.out.println(str2); //bu variable'nin degeri olmadigi icin str2 ye deger atanmadigi icin yazdirilmiyor hata veriyor

        // System.out.println(str2.concat("Java")); //deger atanmadigi icin method'la kullanilamaz


        str2="Java candir";
        System.out.println(str2); // Java candir
        System.out.println(str2.concat(".")); // Java candir.

        String str3= null; //str3'e degeer atanmamistir
                           // null pointer ile javaya deger atamadigimizin farkinda oldugumuzu soyluyoruz

        System.out.println(str3);// null isaretlendigini yazdirir

        System.out.println(str3.concat("Java")); // NullPointerExcaption

        System.out.println(str3 +"Java"); // nullJava

        System.out.println(str3.toUpperCase()); // NullPointerExcaption


    }
}
