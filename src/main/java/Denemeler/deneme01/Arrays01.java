package Denemeler.deneme01;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {
       //ex:
        int grades [] = {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));

        // grades arrayindeki en küçük ve en büyük gradein toplamını ekrana yazdıran kodu yazınız.

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));
        System.out.println(grades[0]+grades[grades.length-1]);



        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den
        // az character icerenleri console'a yazdiriniz
        // [Ajda, Cuneyt, Tom, Ayhan, Filiz]

         String  isim[]={"Ajda","Cuneyt","Tom","Ayhan","Filiz"};

        for (String w:isim) {
            if (w.length()<5){
                System.out.println(w);
            }

        }








        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan
        // sonra F ile baslayan isimlerden onceki isimleri console'a yazdiriniz.

        Arrays.sort(isim);

        for (String r:isim) {
           if(r.startsWith("F")) {
             continue;

            }System.out.println(r);

        }


        System.out.println();

        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan
        // sonra "F" ile baslayan isimlerden onceki isimleri ve "F" ile baslayanlari console'a yazdiriniz.

        for (String t:isim) {
            System.out.print(t+" ");
            if (t.startsWith("F")){
                break;
            }

        }


        System.out.println();



        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz

        for (String b:isim) {
            if (b.startsWith("F")){
                continue;
            }
            System.out.print(b+" ");

        }























        /*String str = "Java ogrenmek, IT alaninda yer edinmek demektir.";

        String arr1[]=str.split(",");
        System.out.println(Arrays.toString(arr1));

        String arr2 []=str.split(" ");
        System.out.println(Arrays.toString(arr2));

        String arr3 []=str.split("");
        System.out.println(Arrays.toString(arr3));*/






    }//main


}//class
