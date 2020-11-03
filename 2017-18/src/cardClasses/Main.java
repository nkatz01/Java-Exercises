package cardClasses;
//package one;

import java.util.*;
public class Main {
    public static void main(String[] args) {
        Card card1 = new Card("Lathrop Brown");

/* print("Card format after constructor without arguments:\n"
+ card.format()); */

        Card card2 = new Card("Emmett Lathrop Brown");
        print("Card format after constructor with String argument:\n"
                + card2.format());

        CallingCard callingcard1 = new CallingCard("Iberia", "3845", "pin123");
        CallingCard callingcard2 = new CallingCard("Lathrop Brown", "3845", "pin123");

        print(callingcard1.format());
//System.out.println(callingcard1.getName());
        DriverLicence  driverlicence1 = new DriverLicence("TruckLicence", "id9875", 2017 );
        DriverLicence  driverlicence2 = new DriverLicence("TruckLicence", "id9875", 2017 );
        print("\n" +driverlicence1.format());
        IDcard idcard1 = new IDcard("myIdCard", "id45968");
        print(  idcard1.format());
//test wallet
        Wallet Berzel1 = new  Wallet();
        Berzel1.addCard(callingcard1);
        Berzel1.addCard(driverlicence1);
        print("\n"+ Berzel1.format());
//test is expired method in drivinglicence class
        print("\n"+ driverlicence1.getName()+"is expired? "+driverlicence1.isExpired()+"!");
//test to string in calling card class
        print( driverlicence1.toString());
        print(callingcard1.toString());
        print(idcard1.toString());
//test equalities
        System.out.println();
        print(""+ driverlicence1.equals(driverlicence2));



    }

    public static void print(String strToPrint){
        System.out.println("\n"+strToPrint);
    }


}