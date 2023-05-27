package java_.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen mail adresinizi yazınız");
        String mail = input.nextLine();

        boolean m1 =mail.contains("@gmail");
        System.out.println("m1 = " + m1);

        boolean m2 =!mail.contains(" ");
        System.out.println("m2 = " + m2);

        boolean m3 = mail.replaceAll("[^A-Z]","").length()== 0;
        System.out.println("m3 = " + m3);

        boolean m4 = mail.replaceAll("[^\\p{Punct}]","")
                .length() > 0;
        System.out.println("m4 = " + m4);

        System.out.println(m1 && m2 && m3 && m4);



    }//main

}//class