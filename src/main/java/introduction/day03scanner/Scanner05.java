package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("İki kenar uzunluğunu yazınız...");

        double kısaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();

        System.out.println(kısaKenar*uzunKenar);
        System.out.println((2*kısaKenar)+(2*uzunKenar));
    }
}
