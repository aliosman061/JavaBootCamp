package Denemeler.deneme01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class Lambda_deneme {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Clara");
        myList.add("Angelina");

        printEl(myList);
        System.out.println();
        printEl2(myList);
        System.out.println();
        printEl3(myList);
        System.out.println();
        printEl4(myList);
        System.out.println();
        printEl5(myList);
        System.out.println();
        printEl6(myList);
        System.out.println();
        printEl7(myList);

    }
    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.

    public static void printEl (List<String>myList) {
        myList.stream().forEach(t-> System.out.print(t+" "));
    }



    //Example 2: Bir List'teki T ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printEl2 (List<String>myList) {
        myList.stream().filter(t-> !t.startsWith("T")).forEach(t-> System.out.print(t+" "));
    }



    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void printEl3 (List<String>myList) {
        myList.stream().filter(t-> t.length()<4).forEach(t-> System.out.print(t+" "));
    }








   //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.

    public static void printEl4 (List<String>myList) {
        myList.stream().filter(t-> t.length()>4).map(t-> t.toUpperCase()).forEach(t-> System.out.print(t+" "));
    }




    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz
   public static void printEl5 (List<String>myList) {
        myList.stream().
                distinct().
                filter(t->t.length()<4).
                map(t->t.toLowerCase()).
                forEach(t-> System.out.print(t+" " ));
   }




    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printEl6 (List<String>myList) {
        myList.stream().distinct().map(t-> t.toUpperCase()).sorted().forEach(t -> System.out.print(t+" "));
    }




    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    public static  void  printEl7(List<String>myList){

        myList.
                stream().
                distinct().
                map(t-> t.toLowerCase()).
                sorted(Comparator.comparing(t->t.length())).
                forEach(t-> System.out.print(t+" "));

    }




}
