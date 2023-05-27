package java_.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a  year: ");
        int num = input.nextInt();
       Object result = num%2==0 ? num/2 : "Bu sayi ikiye bolunmez";
        System.out.println(result);



    }//main



}//class
