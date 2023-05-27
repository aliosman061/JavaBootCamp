package java_.day02printmethodcreation;

import java.util.Scanner;

public class PrintPrintln {
    public static void main(String[] args) {

        System.out.println("JAVA\nİLE\nHAYAT\nGÜZEL");

        // "Techpro " ile java cok ' kolay '
        // tek bir sout ile yazdiran kodu yaziniz

        System.out.println("\"Techpro \" ile java cok ' kolay '");

        //" MAHARET" hic 'DUSMEMEK' degil;


        //  "Her dustugunde kalkabilmektir"


        System.out.println("\"MAHARET\" hic 'DUSMEMEK'" + "degil;\n\n\n\t\"Her dustugunde kalkabilmektir\"");

        // Soru4)  Kullanicidan aldiginiz
        // sekille asagidaki gibi bir gorunum olusturun
      /*
          A
         A A
        A A A
     */
        Scanner input =new Scanner(System.in);
        System.out.println("lütfen bir karakter yazınız");

        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(" ");
        System.out.println(ch+" "+ch+" "+ch);

    }


}
