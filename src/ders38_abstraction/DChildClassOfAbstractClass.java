package ders38_abstraction;

public class DChildClassOfAbstractClass extends CParentsAbstractClass{

    // Abstract bir class'daki, abstract method'larin TAMAMI
    // concrete child class'lar tarafindan override edilmelidir.

    @Override
    public void mecburiMethod1() {
        System.out.println("child class method icerisinde method'u kendine uyarlar");

    }

    @Override
    public void mecburiMethod2() {

    }
}
