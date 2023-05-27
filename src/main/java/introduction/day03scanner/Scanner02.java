package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.println("İlk isminizi giriniz...");
        String firstName = input.next();
        System.out.print("Soy İsminiz giriniz");
        String lastName = input.next();
        System.out.println(firstName +" "+ lastName);

    }
}
