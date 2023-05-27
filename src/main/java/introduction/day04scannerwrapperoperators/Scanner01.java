package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        // kullanıcıdan alacağınız 5 basamaklı ilk iki son iki basamağındaki rakamların toplamını yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen 5 basamaklı bir sayı giriniz...");
    int number = input.nextInt();
    int lastDigit = number%10;
    number = number/10;

    int lastSecondDigit = number%10;
    number = number/10;

    int lastThirdDigit = number%10;
    number = number/10;

    int lastFourthDigit = number%10;
    number = number/10;

    int lastFifitDigit = number%10;
    number = number/10;

        System.out.println(lastDigit+lastSecondDigit+lastFifitDigit+lastThirdDigit);


    }
}
