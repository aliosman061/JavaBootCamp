package java_.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {

        /*
        Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
        1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
        2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
        Soru ders anlatımı için çok anlaşılır bir örnek değil ama neyse
        */


        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a  year: ");
        int year = input.nextInt();

        String result = year % 100 == 0 ? (year % 400 == 0 ? "Leap" : "Not  Leap") :
                year % 4 == 0 ? ("Leap") : ("Not Leap");
        System.out.println(result);


    }//main


}//class
