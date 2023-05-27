package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        // adress al ve ekrana yazdır

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen adresinizi giriniz...");

        String adress = input.nextLine();
        System.out.println(adress);


    }
}
