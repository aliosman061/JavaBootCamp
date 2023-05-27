package b151practices.day_01_practice;

import java.util.Scanner;

public class C08_ifElse {
    public static void main(String[] args) {
       /*

    Kullanicidan hizmet yılını ve maasını ayri ayri sisteme girmesini isteyin.
    Eger 5 ve 5 yıldan daha fazla calısmıssa %10 zamlı maasını konsolda yazdırın.
    5 yıldan daha az calısanların zam alabilmek icin kac yıl daha calısması gerektigini konsola yazdırın

    */

        Scanner scan = new Scanner(System.in);
        System.out.println("KHizmet Yılınızı  giriniz: ");
        int yil = scan.nextInt();
        System.out.println("Maasınızı  giriniz: ");
        int maas = scan.nextInt();
        if (yil >=5  ) {
            System.out.println("Zamlı Maaş: "+(maas+(maas*10/100)));
        }
        else  {System.out.println("Zam alabilmek için " +(5 - yil)+"yil daha çalışmalısın" )
            ;}


    }//main


}//class
