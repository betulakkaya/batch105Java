package ders38_abstraction;

public abstract class CParentsAbstractClass {
    /*

    Abstract bir class abstract methodlara sahip olabilir
    Bir classi abstract yapmak icin class declarationuna abstract keyword eklenmelidir

     */

    public abstract void mecburiMethod1 ();

    public abstract void mecburiMethod2 ();
    // soyut yani abstract methodlarin bodysi olmaz

    public String concreteMethod(){
        // Bugune kadar kullandigimiz normal method'lara
        // soyut olmayan method demek yerine concrete method denir
        return "";
    }


    /*
    Bir parents class'da child class'larin mutlaka override edecegi bir method
    olusturdugumuzda method body'si gereksizlesir
    cunku hic calismayacaktir

    1- abstract parent classdan obje olusturulamayacagi icin objeler icin bu method kullanilamaz
    2- child class'lar da mecburen bu methodu override edeceklerinden,
       bu methodlarin body'si asla kullanilmayacaktir.

    Java hic kullanilmayacak bu method bodyleri yazmamamiza imkan tanimistir

     */

    // child classlarin mutlaka override etmesini istedigimiz methodlari
    // abstract olarak tanimlar ve bodysiz olarak olustururuz
}
