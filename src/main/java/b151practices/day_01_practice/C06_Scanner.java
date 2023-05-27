package b151practices.day_01_practice;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
// isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.
        Scanner input=new Scanner(System.in);
        System.out.println("Adınızı ve soyadınızı giriniz...");
        String isimSoyisim=input.nextLine().toUpperCase();
        char isimIlkKarakter=isimSoyisim.charAt(0);
        char ikinciIsimIlkKarakter = isimSoyisim.split(" ")[1].charAt(0);
        char soyIsimIlkKarakter    = isimSoyisim.split(" ")[2].charAt(0);
        System.out.println(""+isimIlkKarakter+ikinciIsimIlkKarakter+soyIsimIlkKarakter);



    }//main
}//class
