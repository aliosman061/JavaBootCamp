package b151practices.day_01_practice;

public class C01_BasamaklaraAyirma {

    public static void main(String[] args) {

// 12345 sayısını rakamları toplamını bulunuz.


        int i=12345;
        int birler = i%10;
       int onlar = (i/10)%10;
       int yüzler = (i/100)%10;
       int binler = (i/1000)%10;
       int onBinler=(i/10000)%10;
        System.out.println(birler+ onlar+ yüzler+ binler+onBinler);


        //Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz.

        System.out.println((int)'A'+'B'+'C'+'D'+'E'+'F');





    }//main

}//class
