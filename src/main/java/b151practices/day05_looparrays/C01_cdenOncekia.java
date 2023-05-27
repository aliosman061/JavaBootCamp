package b151practices.day05_looparrays;

import java.util.Scanner;

public class C01_cdenOncekia {


    //Toplama ve cikarma islemlerinde default deger sifirdir.(0)
//Carpma ya da bolme islemlerinde default deger birdir (1)
//String datalar icin ""; (hiclik


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 'c' ve 'a' harflerini iceren bi kelime girinizi");
        String str = input.nextLine().toLowerCase();

        int counter =0;   // default değer + ve - ise 0sıfırdır. * veya / ise 1 dir. String datalar için ise ""; hiçliktir.

        for (int i = 0; i <str.indexOf("c") ; i++) {
            if (str.charAt(i) == 'a'){
                counter++;
            }

        }
        System.out.println("c'den once "+counter+"'a vardır.");


        //2.yol

        int sayac = 0;
        if (str.contains("c") && str.contains("a")) {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == 'a') {
                    sayac++;
                } else if (str.charAt(i) == 'c') {
                    break;
                }//else if

            }//for loop
            System.out.println("C'den onceki a sayisi " + sayac);

        } else {
            System.out.println("Lutfen c ve a harflerini iceren kelime giriniz");
        }







    }//main



}//class
