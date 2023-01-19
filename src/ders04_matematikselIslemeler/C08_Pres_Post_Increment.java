package ders04_matematikselIslemeler;

public class C08_Pres_Post_Increment {
    public static void main(String[] args) {

        int x=3;

        int y =2 * ++x;

        int z= 5 + y--;

        System.out.println(x+y+z);

    }
}
