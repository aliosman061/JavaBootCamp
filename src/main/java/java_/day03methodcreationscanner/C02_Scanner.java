package java_.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {

        // Kullanicidan data almak icin Scanner class'indan scan/input/scanner objesi olustururuz.
        // Bu sekilde kullaniciyi yonlendirerek gerekli datalari elde ederiz.

        Scanner input = new Scanner(System.in);
        System.out.println("lütfen cinsiyetinizi giriniz");
        char cinsiyet = input.next().charAt(0);

        System.out.println("lütfen adınızı giriniz");
        String ad = input.next();

        System.out.println("lütfen memleketinizi giriniz");
        String memleket = input.next();

        System.out.println("lütfen yasınızı giriniz");
        double yas = input.nextDouble();

        System.out.println("Ülkenizi seviyormusunuz");
        boolean evetHayır = input.nextBoolean();

        System.out.println("Maasınız giriniz");
        int maas = input.nextInt();


        System.out.println("cinsiyet = " + cinsiyet);

        System.out.println("ad = " + ad);

        System.out.println("memleket = " + memleket);

        System.out.println("yas = " + yas);

        System.out.println("evetHayır = " + evetHayır);

        System.out.println("maas = " + maas);




    }//method
}
