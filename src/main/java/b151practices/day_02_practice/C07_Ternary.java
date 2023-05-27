package b151practices.day_02_practice;

import java.util.Scanner;

public class C07_Ternary {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */


        Scanner input = new Scanner(System.in);
        System.out.println("Sisteme bir karakter giriniz..");
        char x = input.next().charAt(0);

        System.out.println((x>='a' && x<='z') || (x>='A' && x<='Z') ? (x>='A' && x<='Z'? "Büyük Harf" : "Küçük Harf"):("Harf Değil..."));









    }//main

}//class
