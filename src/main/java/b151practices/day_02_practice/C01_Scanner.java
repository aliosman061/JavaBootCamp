package b151practices.day_02_practice;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        // Kullanıcından adını, ikinci adını ve soyadını arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // adının ilk karakterini, ikinci adının ilk karakterini ve soyadının ilk karakterini BUYUK harfle yazdırınız.

        Scanner input = new Scanner(System.in);
        System.out.println("Adinizi, İkinci adinzi ve soyadinizi aralarinda boşluk olacka şekilde giriniz.");
        String str = input.nextLine().toUpperCase();

        char adİlkHarf =str.charAt(0);
        char ikinciHarf =str.charAt(str.indexOf(" ")+1);
        char soyadİlkHarf = str.charAt(str.lastIndexOf(" ")+1);
        System.out.println(""+adİlkHarf+ikinciHarf+soyadİlkHarf);


    }//main
}//class
