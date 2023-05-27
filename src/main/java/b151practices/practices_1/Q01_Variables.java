package b151practices.practices_1;

public class Q01_Variables {
    public static void main(String[] args) {

        int age = 25;

        String isim = "Ali";

        System.out.println("age = " + age);


        System.out.println(age);

        System.out.println("isim = " + isim);

        int hisAge = age;
        String onunIsmi = isim;
        System.out.println("onunIsmi = " + onunIsmi);
        
        System.out.println("hisAge = " + hisAge);
        // aynı satırda çoklu variables dekelere et.
        int year=2022, month=3, day=15;
        System.out.println("year = " + (year+month+day));
        year=2050;
        System.out.println("year = " + year);
        year =year +5;
        System.out.println("year = " + year);
        //Bir variable deklere et : x
        int kol;

        //Bir variable başlat : y
        int yas = 23;

        //Başka bir variable başlat : z

        int yıl = 2023;

        //x değişkenini y değişkeni ile başlat

        kol = yıl;
        //Variabley'i güncelle

        age=25;

        //Değişkenleri yazdır
        System.out.println("kol = " + kol);
        System.out.println("yıl = " + yıl);
        System.out.println("yas = " + yas);


    }

}
