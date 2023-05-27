package b151practices.day_02_practice;

import java.util.Scanner;

public class C04_ifElse {
    public static void main(String[] args) {
         /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Birinci Kelimeyi girin");
        String ilkkelime = input.next();

        Scanner input2 = new Scanner(System.in);
        System.out.println("ikinci Kelimeyi girin");
        String ikinncikelime = input2.next();


        if (ilkkelime.length()%2==0){
            String ilkkelimeilkyarisi =ilkkelime.substring(0, ilkkelime.length()/2);
            String ilkkelimeikinciyarısı = ilkkelime.substring(ilkkelime.length()/2);
            System.out.println(ilkkelimeilkyarisi+ikinncikelime+ilkkelimeikinciyarısı);
        }else{
            System.out.println("il kelimenin ortasına ikinci kelimeyi koyamazsın cünkü ilk kelime tek karakterli");
        }






    }//main
}//class
