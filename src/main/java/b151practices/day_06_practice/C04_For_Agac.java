package b151practices.day_06_practice;

import java.util.Scanner;

public class C04_For_Agac {
    public static void main(String[] args) {

        /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */




        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen yaprak satır sayısını giriniz: ");
        int yaprakNum = input.nextInt();
        System.out.println("Lütfen gövde satır sayısını giriniz: ");
        int govdeNum = input.nextInt();
        String yaprak = "^";
        String govde = "|||";
        for (int i =1;i<=yaprakNum;i++){
            for (int k=1;k<=i;k++){
                System.out.print(yaprak);
            }
            System.out.println();
        }
        for (int i =1;i<=govdeNum;i++){
            System.out.println(govde);
        }







    }
}
