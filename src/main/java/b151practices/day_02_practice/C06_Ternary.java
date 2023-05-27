package b151practices.day_02_practice;

import java.util.Scanner;

public class C06_Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci tam sayıyı giriniz.");
        int sayı1 = input.nextInt();

        Scanner input2 = new Scanner(System.in);
        System.out.println("ikincici tam sayıyı giriniz.");
        int sayı2 = input2.nextInt();


        System.out.println(sayı1 == sayı2 ? ("Sayılar Birbirine Esit") :(sayı1>sayı2 ? ("Büyük Ssayi: "+ sayı1) : ("Büyük Ssayi: "+sayı2)));




    }//main
}//class
