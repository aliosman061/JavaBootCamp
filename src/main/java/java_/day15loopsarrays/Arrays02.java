package java_.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Arrayleri kısayoldan nasıl oluşturabiliriz.

        int grades [] = {67,98,100,34,76};
        System.out.println(Arrays.toString(grades));

        // grades arrayindeki en küçük ve en büyük gradein toplamını ekrana yazdıran kodu yazınız.

        Arrays.sort(grades);
        System.out.println(Arrays.toString(grades));

        System.out.println(grades[0]+grades[grades.length-1]);


        //Example 2: Size verilen bir String array'deki isimlerden 5 character'den az character icerenleri console'a yazdiriniz
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";
        stdNames[3] = "Cuneyt";
        stdNames[2] = "Tom";
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        // [Ajda, Cuneyt, Tom, Ayhan, Filiz]
        for(String w : stdNames){
            if(w.length()<5){
                System.out.println(w);
            }
        }

        //Example 3: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra F ile baslayan
        //           isilerden onceki isimleri console'a yazdiriniz

        Arrays.sort(stdNames);// [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames){
            if(w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }

        //Example 4: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //           isimlerden onceki isimleri ve "F" ile baslayanlari console'a yazdiriniz
        Arrays.sort(stdNames);// [Ajda, Ayhan, Cuneyt, Filiz, Tom]

        for(String w : stdNames){
            System.out.println(w);
            if(w.startsWith("F")){
                break;
            }
        }

        //Example 5: Size verilen bir String array'deki isimleri alfabetik siraya koyduktan sonra "F" ile baslayan
        //           isimler haric diger isimleri console'a yazdiriniz


        Arrays.sort(stdNames);//sort() method'u numeric data'lari kucukten buyuge(ascending) dizer,
        // String'leri ise alfabetik sirada(alphabetically) dizer.
        // ascending + alphabetically ==> Natural Order

        for(String w : stdNames) {

            if (w.startsWith("F")) {
                continue;
            } else {
                System.out.println(w);
            }
        }




    }//main

}//class
