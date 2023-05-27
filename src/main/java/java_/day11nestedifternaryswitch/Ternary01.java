package java_.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {

        Scanner input    = new Scanner(System.in);
        System.out.println("Please enter two integers");

     //1.yol
        int sayı1 = input.nextInt();
        int sayı2 = input.nextInt();
       /*  if(sayı1<sayı2){
            System.out.println(sayı1);}
        else{
            System.out.println(sayı2);} */

        // 2. yol
        int sonuc = sayı1 <sayı2 ? sayı1 : sayı2;
        System.out.println(sonuc);
        // ? = ise
        // : = değilse







    }//main



}//clas
