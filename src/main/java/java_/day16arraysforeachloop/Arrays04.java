package java_.day16arraysforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = " java is  easy. Learn Java earn money. ";

     String words [] =   s.split(" ");
        System.out.println(words);
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        //ex2 Size verilen bir cümlede kac harf oldugunu gösteren kodu yazınız.

        String   letters [] =s.replaceAll("[\\W]","").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);





    }//main
}//class
