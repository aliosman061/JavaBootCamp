package java_.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {


        List<String > iller = new ArrayList<>(Arrays.asList("Van", "Hatay", "Edirne", "Gaziantep",
                "Eskisehir", "Ordu", "MUS", "MUS", "Nevsehir"));

        bykHrfLenghtArtanSiradaTkrsz(iller);
        System.out.println();

        bykHrfUzunluklarınaGoreArtanSiradaTkrszAynıAlfabetikSirada(iller);
        System.out.println();

        bykHrfUzunluklarınaGoreArtanSiradaTkrszAynıAlfabetikSirada(iller);
        System.out.println();

        System.out.println(karakterSysi5tenFazlaElSil(iller));
        System.out.println();

        System.out.println(hIleBaslayanYadaUIleBitenElSil(iller));
        System.out.println();

        System.out.println(elKarakterSayilarininKareleriniAl(iller));
        System.out.println();
        System.out.println(karakterSayisiCiftOlanlariListYazdir(iller));
        System.out.println();


    }//main

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLenghtArtanSiradaTkrsz(List<String > iller){
        System.out.print("1) ");
        iller.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.length())).//son harfine göre
                forEach(t-> System.out.print(t+" "));
    }



    // 2) Tum list elemanlarini buyuk harfle, son harflerine gore artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHarflerineGoreArtanSiradaTkrsz(List<String>iller){
        System.out.println("2 ");
        iller. stream().map(t-> t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//
                forEach(t-> System.out.print(t+" "));
    }
      /*
         forEach(t-> System.out.print(t+" ")) Lambda bu yapiyi sevmez Bunun yerine Method Referance yontemini bulmus
         */



    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar

    public static void bykHrfUzunluklarınaGoreArtanSiradaTkrszAynıAlfabetikSirada (List<String>iller){
        System.out.print("3) ");
        iller.stream().distinct().map(String :: toUpperCase ).sorted(Comparator.comparing(String :: length).thenComparing(Comparator.naturalOrder())).

        forEach(System.out::print);
    }



    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz

 public static List <String>  karakterSysi5tenFazlaElSil(List<String> iller ){
     System.out.print("4) ");
        iller.removeIf(t-> t.length() > 5);
        return iller;
 }


    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanYadaUIleBitenElSil(List<String> iller ){
        System.out.print("5) ");
        iller.removeIf(t->t.startsWith("H") || t.endsWith("u"));
        return iller;

    }


    // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
public static List<Integer> elKarakterSayilarininKareleriniAl( List<String>iller ){// buraya kullanacağımız yerin return type yazılır
    System.out.println("6) ");
    return iller.
            stream().
            map(Utils::karesiniAl).// LAMBDA EXPRESSION   map(t->t.length() * t.length()).
                    collect(Collectors.toList());

}



    //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> karakterSayisiCiftOlanlariListYazdir(List<String> iller ) {
        System.out.print("7) ");
        return  iller.
                stream().
                filter(Utils::ciftMi).//Lambda expression filter(t->t.length() %2 ==0).
                        collect(Collectors.toList());
    }

}
