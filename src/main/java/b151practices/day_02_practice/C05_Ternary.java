package b151practices.day_02_practice;

import java.util.Scanner;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner input = new Scanner(System.in);

        System.out.println("bir tam sayı giriniz");
        int sayı = input.nextInt();

        System.out.println(sayı%2==0 ? ("çift sayı") : (sayı+3));




    }//main
}//class
