package java_.day14loops;

import java.util.Scanner;

public class Loops01 {
    public static void main(String[] args) {
        //verilen bir tamsayının tekrarsız rakamlarının toplamını bulunuz.
        //1838

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an ınteger....");
        String s = input.next();
         int sum=0;
         for (int i = 0; i < s.length(); i++) {
             String d = s.substring(i,i+1);
             if(s.indexOf(d)==s.lastIndexOf(d)) {
                 sum=sum + Integer.valueOf(d)  ;
             }
         }

         System.out.println(sum);

         String t= "Alala";
         String result = "" ;

         for (int i = 0; i < t.length(); i++) {

             char c = t.charAt(i);
             if((t.indexOf(c) != t.lastIndexOf(c)) && !result.contains(""+c)){
                 result = result + c;
             }
         }
        System.out.println(result);




    }//main



}//class
