package b151practices.day_02_practice;

import java.util.Scanner;

public class C02_ifElse {
    public static void main(String[] args) {

        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir
     */


        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen üçgenin a kanerını giriniz");
        int a=input.nextInt();

        System.out.println("lütfen üçgenin b kenarını giriniz");
        int b=input.nextInt();

        System.out.println("lütfen üçgenin c kenarını giriniz");
        int c=input.nextInt();

        if (a*a + b*b == c*c){
            System.out.println("Bu bir dik üçgendir...");
        }else if (b*b + c*c == a*a){
            System.out.println("Bu bir dik üçgendir...");

                    }else if (c*c + a*a == b*b){
            System.out.println("Bu bir dik üçgendir...");
                    }else{
            System.out.println("bu bir dik üçgen değildir...");
        }



    }//main
}//class
