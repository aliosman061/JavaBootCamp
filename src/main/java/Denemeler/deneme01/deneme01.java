package Denemeler.deneme01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class deneme01 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicinin girdigi harf list'te var ise o harfi "Buldum!" a cevirin, yok ise o harfi list'e ekleyin
    */
        List<String> myList = new ArrayList<>();
        myList.add("A");
        myList.add("H");
        myList.add("J");
        System.out.println(myList);


        Scanner input= new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        String harf =input.next();

        if( harf.equals(myList)){}





    }


}
