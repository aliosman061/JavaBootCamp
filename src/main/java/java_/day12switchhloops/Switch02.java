package java_.day12switchhloops;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen iki sayı giriniz");
        double sayi = input.nextDouble();
        double sayi2 = input.nextDouble();

        System.out.println("yapılacak işlemi griniz... +,-,*,/,% den birini seçiniz");
        char opr = input.next().charAt(0);

        switch (opr) {
            case '+':
                System.out.println(sayi + sayi2);
                break;
            case '-':
                System.out.println(sayi - sayi2);
                break;
            case '*':
                System.out.println(sayi * sayi2);
                break;
            case '/':
                System.out.println(sayi / sayi2);
                break;
            case '%':
                System.out.println(sayi * sayi2/100);
                break;
                default:
                    System.out.println("lütfen geçerli bir işlem giriniz");
        }






    }//main
}//class
