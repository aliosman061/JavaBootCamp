package b151practices.day_01_practice;

import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */

        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı Giriniz: ");
        String ad = scanner.nextLine();
        System.out.print("Soyadınızı Giriniz: ");
        String soyad = scanner.nextLine();
        System.out.print("Yaşınızı Giriniz: ");
            byte yas = scanner.nextByte();
        System.out.print("Boyunuzu Giriniz: ");
        double boy = scanner.nextDouble();
        System.out.print("Kilosunuzu Giriniz: ");
            byte kilo = scanner.nextByte();

        System.out.println("Adı: " + ad +"\n" +"Soyad: " + soyad+"\n"+"Yas: " + yas+"\n"+"boy: " +boy+"\n"+"kilo: " + kilo);





    }


}
