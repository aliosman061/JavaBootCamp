package introduction.day03scanner;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        // kullancıdan iki sayı alıp 4 işlem yapan ve islemlerin sonuçlarını ekrana yansıtan kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("İki sayı giriniz...");
        double firstNumber = input.nextDouble();
        double lastNumber = input.nextDouble();

        System.out.println(firstNumber+lastNumber);
        System.out.println(firstNumber-lastNumber);
        System.out.println(firstNumber/lastNumber);
        System.out.println(firstNumber*lastNumber);
    }
}
