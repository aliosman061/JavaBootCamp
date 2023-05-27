package Denemeler.deneme01;

import java.util.Scanner;

public class mentörsorular {
    public static void main(String[] args) {

        //ex=1 // kullanıcıdan ilk ismini ve soyismini alıp ikisini aynı satırda ekrana yazıdırınız.
        Scanner input = new Scanner(System.in);

       /* System.out.println("lütfen isminizi yazınız");
        String ilkİsim =input.nextLine();

        System.out.println("lütfen soy isminizi yazınız");
        String soyİsim  =input.next();

        System.out.println(ilkİsim+" "+soyİsim);


        //ex2: Kullanıcıdan alacağınız 5 basamaklı bir sayının ilk iki ve son iki basamağındaki rakamları toplamını
        //yazan kodu yazınız. ör: 38671

        Scanner input2 = new Scanner(System.in);
        System.out.println("Lütfen beş basamaklı bir sayı giriniz"  );
        int sayı = input2.nextInt();
        int bes= sayı%10;//1
        sayı = sayı/10;//3867

        int dört = sayı%10;//7
        sayı= sayı/10;//386
        int üç = sayı%10;//6
        sayı= sayı/10;//38
        int iki = sayı%10;//8
        sayı= sayı/10;//3
        int bir= sayı%10;//3


        System.out.println(bir+iki+dört+bes);

        // ex3 Stringdeki tüm harfler dışındaki karakterleri '+' yazınız.

        String cümle = "Java Kolaydir ama bazen";

        System.out.println(cümle.replaceAll("[\\w]", "+"));

        *//**//* ex:4 Kullanıcıdan email adresini girmesini isteyin aşağıdaki şartlara göre;
        -mail adersi @gmail.com içermelei
        -Space olmamalı
        -Büyük Harf olmamalı
        - En az bir tane noktalama işareti olmalı
         *//**//*

        Scanner input3 = new Scanner(System.in);
        System.out.println("lütfen bir email hesabı girnizi");
        String mail = input3.nextLine();

        boolean gmail = mail.contains("@gmail.com");
        System.out.println("gmail = " + gmail);

        boolean space = !mail.contains(" ");
        System.out.println("space = " + space);

        boolean büyükharf =mail.replaceAll("[^A-Z]","").length() == 0;
        System.out.println("büyükharf = " + büyükharf);

        boolean    noktalama =mail.replaceAll("[^\\P{P}]","").length() > 0;
        System.out.println("noktalama = " + noktalama);

     //ex 4- Kullanıcıdan aldığınız sayı 3 basamaklı ise ekrana sayı üç basamaklıdır yazın.
        System.out.println("lütfen üç basamaklı bir sayı giriniz..");
        int res= input.nextInt();

        if(res>99 && res<1000){
            System.out.println("sayı üç basamaklıdır");
        }else{
            System.out.println("Girdiğiniz sayı geçerli değildir.");
        }*//*
      //ex 5- Verilen harf büyük harf ise ekrana büyük harf yyazdıran kodu yazınız.

        System.out.println("lütfen sisteme büyük harf giriniz");
        char harf= input.next().charAt(0);
        if ( harf>='A'&& harf<='Z'){
            System.out.println("Büyük harf");
        }else{
            System.out.println("yanlış girdiniz...");
        }
        //ex 6- Kullanıcıdan aldığınız sayı çiftmi tekmi ekrana yazdırınız
        System.out.println("lütfen bir sayı giriniz...");
        int i =input.nextInt();
        if(i%2==0){
            System.out.println("Çift Sayı");
        }else{
            System.out.println("Tek Sayı");
        }
        // ex 7 - verilen sayı pozitifmi negatif mi nötrmi ekrana yazdırın

        System.out.println("Lütfen bir sayı giriniz");
        int v =input.nextInt();
        if (v>0){
            System.out.println("Pozitif Sayı");
        } else if (v==0) {
            System.out.println("Nötr");
        }else{
            System.out.println("Negatif  Sayı");
        }*/
      //ex 8 - Kullanıcı günün ismini girdiğinde kod  yazın
        System.out.println("lütfenin gün numarasını giriniz");
        int gün = input.nextInt();
        String isim="";
        if (gün == 1){
            isim="Pazar";
        }else if (gün == 2){
            isim="Pazartesi";
        } else if (gün==3) {
            isim="Salı";
        }else if (gün==4){
            isim="Çarşamba";
        }else if (gün==5){
            isim="Perşembe";
        }else if (gün==6){
            isim="Cuma";
        }else if (gün==7){
            isim="Cumartesi";
        }else{
            System.out.println("Geçersiz Bir sayı girdiniz");
            System.exit(0);
        }
        System.out.println("Gün İsmi: "+ isim);

    }//main
}//clas
