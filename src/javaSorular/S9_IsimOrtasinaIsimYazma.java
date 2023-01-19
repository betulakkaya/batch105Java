package javaSorular;

public class S9_IsimOrtasinaIsimYazma {
    public static void main(String[] args) {

         /*
		name1 ve name2 degiskenlerini olusturun.
		name1 degiskeninin karakter sayisi cift ise kelimenin ortasina name2 yi yerlestirin.
		name1 degiskeninin karakter sayisi tek ise "name1 cift sayili olmadigi icin ortasina yerlestiremedik" yazdirin.
		          e.g:
		         name1= mehmet
		         name2= ahmet
		         Print ==> mehahmetmet
		*/

        String isim1= "ahmett";
        String isim2= "mehmet";

        if (isim1.length()%2==0){
            System.out.println(isim1.substring(0,isim1.length()/2)+isim2+isim1.substring(3));
        }else
            System.out.println("name1 cift sayili olmadigi icin ortasina yerlestiremedik");
    }
}
