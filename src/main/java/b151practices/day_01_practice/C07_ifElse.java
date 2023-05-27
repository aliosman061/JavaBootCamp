package b151practices.day_01_practice;

import java.util.Scanner;

public class C07_ifElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        // çalıştırıyoruz.

        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı giriniz: ");
        int ilksayı = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int ikincsayı = input.nextInt();
        if (ilksayı > ikincsayı) {
            System.out.println("İlk sayı ikinci sayıdan büyüktür.");
        } else {
            System.out.println("ilk sayı ikinci sayıdan büyük değildir.");
        }


    }//main
}//clas
