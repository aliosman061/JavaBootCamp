package java_.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatment {


    public static void main(String[] args) {
        // Ex: Verilen bir karakterin buyuk harf ise ekrana
// "Buyuk Harf " yazdiran kodu yaziniz"
        char ch = 'A';

        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf");
        }

        byte sayi = 12;
        if (sayi % 2 == 0) {
            System.out.println("Çift Sayi");
        }

        int i = -147;
        if (i<300 || i>1200) {
            System.out.println("Harika Yazi");}

            Scanner input = new Scanner(System.in);
            int number= input.nextInt();

           /* if (number%2 ==0 ){
                System.out.println("çift sayi");}
            if (number%2 == 1) {
                System.out.println("Tek Sayi"); }*/

        if (number%2 ==0 ){
            System.out.println("çift sayi");}else{
            System.out.println("tek sayidir");}

        int numara =0;
        if(numara<0){
            System.out.println("negatif");}else if(numara==0){
            System.out.println("nötr");}else{
            System.out.println("pozitif");
        }



        }//main

    }//class






