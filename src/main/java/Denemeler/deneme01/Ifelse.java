package Denemeler.deneme01;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
//
//        Scanner input =new Scanner(System.in);
//        System.out.println("lütfen bir char giriniz");
//        char harf= input.next().charAt(0);
//
//        if(harf>='A' && harf<='Z' ){
//            System.out.println("Buyuk Harf");
//        }else System.out.println("Kucuk Harf");
//
//        System.out.println("lütfen bir sayı giriniz");
//        int tc = input.nextInt();
//
//        if (tc%2!=1){
//            System.out.println("Çift Sayı");
//        }else System.out.println("Tek Sayı");
//
//
//        System.out.println("lütfen bir sayı giriniz");
//        int ork= input.nextInt();
//
//        if (ork>299 && ork<1201) {
//            System.out.println("Harika Sayi");
//        }else System.out.println("leşşşş");



        String str ="aac";
        char ch = str.charAt(0);
        System.out.println(str.indexOf(ch));
        System.out.println(str.lastIndexOf(ch));

        char ch2 = str.charAt(1);
        System.out.println(str.indexOf(ch2));
        System.out.println(str.lastIndexOf(ch2));
        char ch3 = str.charAt(2);
        System.out.println(str.indexOf(ch3));
        System.out.println(str.lastIndexOf(ch3));


    }
}
