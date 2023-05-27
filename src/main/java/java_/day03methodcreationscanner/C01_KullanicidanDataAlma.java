package java_.day03methodcreationscanner;

import java.util.Scanner;

public class C01_KullanicidanDataAlma {
    public static void main(String[] args) {

        //Kullanicidan aldiginiz
// character ile asagidaki gibi bir gorunum olusturunuz
/*
          A
         A A
        A A A
 */

        Scanner input = new Scanner(System.in);
        System.out.println();
        char kh = input.next().charAt(0);
        System.out.println("  "+kh+"  ");
        System.out.println(" "+kh+" "+kh+" ");
        System.out.println(kh+" "+kh+" "+kh);
        System.out.println("\t\t"+kh+"\t\t" +"\n\t"+kh+"\t\t"+kh+"\t\t"+"\n"+kh+"\t\t"+kh+"\t\t"+kh+"\t");
    }//main
}//class
