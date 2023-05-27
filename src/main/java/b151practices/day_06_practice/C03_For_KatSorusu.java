package b151practices.day_06_practice;

import java.util.Scanner;

public class C03_For_KatSorusu {
    public static void main(String[] args) {

        /*
         Kullanıcıdan sisteme bir sayı girmesini isteyiniz.
         1'den kullanıcının girdigi sayıya kadar yazdırınız


        NOT:
        3'un ve 5'in katı olan sayıların yerine 15k yazdırılacak
        5'in katı olan sayıların yerine 5k yazdırılacak
        3'un katı olan sayıların yerine 3k yazdırılacak




        Ornegin : 1 2 3k 4 5k 3k 7 8 3k 5k 11 3k 13 14 15k...

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");

        int sayi = input.nextInt();

        for (int i = 0; i <= sayi ; i++) {//1'den sayi değerine kadar döngüye aldık

            if(i%3==0 && i%5==0){
                System.out.print("15K ");//3 ve 5 e tam bölünüyormuy
            } else if (i%5==0) {
                System.out.print("5K ");//5 ebölünüyormu

            } else if (i%3==0) {
                System.out.print("3K ");//3 e bölünüyormu
            }else {
                System.out.print(i+" ");//değilse i değerini yazdıracak
            }
        }






    }
}
