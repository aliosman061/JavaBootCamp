package java_.day12switchhloops;

import com.sun.source.tree.CaseTree;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {

        //ex: ay numarası soyleyince , numarası verlen aydan başlayıp 12. aya kadar tüm aylarını isimlerini yazdıran kodu yazınız.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen başlangıç ayının kacıncı ay oldugunu yazınız...");
        int ay = input.nextInt();

        switch (ay) {
            case 1:
                System.out.println("January");

            case 2:
                System.out.println("February");

            case 3:
                System.out.println("March");

            case 4:
                System.out.println("April");

                case 5 :
                    System.out.println("May");

            case 6:
                System.out.println("June");

            case 7:
                System.out.println("July");

            case 8:
                System.out.println("August");

            case 9:
                System.out.println("September");

            case 10:
                System.out.println("October");

            case 11:
                System.out.println("November");

            case 12 :
                System.out.println("December");
                break;
                default:
                    System.out.println("lutfen gecerli ay giriniz" );

        }





    }//main



}//class
