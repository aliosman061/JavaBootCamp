package java_.day04memorykullanımıwrapperclass;

import java.util.Scanner;

public class Araba {

    public static void main(String[] args) {
        Araba volvo = new Araba();

        yakıt();
        hareket();
        dur();





    /*

    Class ==> Variable ( Pasif Özellikler) ==> Object
          ==> Methodlar

     */
        // Class ismi objenin ismi = new Classİsmi()==>Constructor;

    }

    private static void dur() {
        System.out.println("volvo güvenle durur");
    }


    private static void hareket() {
        System.out.println("volvo hızlı gider");
    }


    private static void yakıt() {
        System.out.println("volvo güvenle durur");
    }
}