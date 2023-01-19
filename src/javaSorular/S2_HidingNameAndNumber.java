package javaSorular;

import java.util.Locale;
import java.util.Scanner;

public class S2_HidingNameAndNumber {
    public static void main(String[] args) {

        /*
         * Ask user Name, Surname and credit card numbers than
         * convert it to special form
         *
         * (Check credit card number, if there aren’t 16 digit
         * print “Invalid credit card number”)
         *
         * Input : John White 1234234534561478
         * Output : Name : J*** W****
         *          CCN  : **** **** **** 1478
         *  (Initials for name and surname should be uppercase)
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name= scan.nextLine();
        System.out.println("Please enter your surname");
        String surname= scan.nextLine();
        System.out.println("Please enter your credit number");
        String ccn= scan.nextLine();

        if (ccn.length()!= 16){
            System.out.println("Invalid credit card number");
        }
        else{
            name=   name.substring(0,1).toLowerCase(Locale.ROOT) +
                    name.substring(1).replaceAll("\\w","*" );

            surname= surname.substring(0,1).toLowerCase(Locale.ROOT) +
                     surname.substring(1).replaceAll("\\w","*" );

            ccn = "**** **** **** " + ccn.substring(12);
        }

        System.out.println("Name :" + name + "\nSurname :" + surname + "\nCCN :" + ccn);


    }
}
