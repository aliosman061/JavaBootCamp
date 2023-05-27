package java_.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManpulaions {
    public static void main(String[] args) {
        /*
        Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz

        i) En az 8 karakterden olussun
        ii)Password space icermesin
        iii)En az 1 tane buyuk harf olsun
        iv) En az 1 tane kucuk harf olsun
        v) En az 1 tane sembol olsun
        vi) En az 1 tanede rakam olsun

         */


        Scanner input = new Scanner(System.in);
       String pwd = input.nextLine();
        boolean krktrSys = pwd.length()>8;
        boolean spc = !pwd.contains(" ");
        boolean bykHrf = pwd.replaceAll("[^A-Z]","").length()>0;
        boolean kckHrf = pwd.replaceAll("[^a-z]", "").length()>0;
        boolean sembol = pwd.replaceAll("[a-zA-z0-9]", "").length()>0;
        boolean rakam = pwd.replaceAll("[^0-9]","").length()>0;

        System.out.println("Gecerlimi: "+ (krktrSys && spc && bykHrf && kckHrf &&
                sembol && rakam));

    }//main


}//class
