package java_.day09Stringmanipulationsifstatement;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        String str ="aac";
       char ch = str.charAt(0);

        if(str.indexOf(ch) == str.lastIndexOf(ch)){
            System.out.println(ch+"üç");
        };
        char ch2 = str.charAt(1);
        if(str.indexOf(ch2) == str.lastIndexOf(ch2)){
            System.out.println(ch2+"iki");
        };
        char ch3 = str.charAt(2);
        if(str.indexOf(ch3) == str.lastIndexOf(ch3)){
            System.out.println(ch3+"bir");
        };

        int number = 12;
        if(number>-1 && number<10){
            System.out.println("Rakam");
        }
        int n = -234;
        n = Math.abs(n);
        if(n>99&&n<1000){
            System.out.println("Sayı Üç basamaklıdır...");}




        /* public class C02_IfStatement {
            public static void main(String[] args) {
                // Kullanici gun ismini girsin kod gunu yazsin
                // 1 ==> Pazar 2 ==Pazartesi  3 ==Sali  4== Carsamba
                // 5== Persembe  6 == Cuma  7 == Cumartesi

                 Scanner input = new Scanner(System.in);
                System.out.println("Lutfen gun numarasini giriniz\n " +
                        "1 ==> Pazar 2 ==>Pazartesi  " +
                        "3 ==>Sali  4==>Carsamba\n" +
                        "5==> Persembe  6 ==>Cuma " +
                        " 7 ==>Cumartesi");

                byte gunNo = input.nextByte();

                if(gunNo ==1){
                    System.out.println("Pazar");
                }else if(gunNo==2){
                    System.out.println("Pazartesi");
                }else if(gunNo==3){
                    System.out.println("Sali");
                }else if(gunNo==4){
                    System.out.println("Carsamba");
                } else if (gunNo == 5) {
                    System.out.println("Persembe");
                }else if (gunNo==6){
                    System.out.println("Cuma");
                }else if(gunNo==7){
                    System.out.println("Cumartesi");
                }else{
                    System.out.println("Lutfen gecerli bir rakam giriniz." +
                            "\"1 ==> Pazar " +
                            "2 ==>Pazartesi   +\n" +
                            "3 ==>Sali  4==>Carsamba\n +\n" +
                            "5==> Persembe  6 ==>Cuma  +\n" +
                            "7\" ==>Cumartesi");
                }


            }//main
        }//class*/






    }//main
}//class