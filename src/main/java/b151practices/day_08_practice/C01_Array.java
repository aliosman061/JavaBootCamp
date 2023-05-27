package b151practices.day_08_practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Array {
    public static void main(String[] args) {

         /*
        Bir Array içerisindeki 'minimum', 'maksimum'  ve 'ikinci maksimum' elemanları bulan bir kod yazınız.

        input: int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};

        output: min:-90, max:10001, ikincimax: 8787

       */
        int[] arr = { 100, 10001, -90, 845, 8787, 898, 0, 1};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));


        System.out.println("minimum: "+ arr[0]);
        System.out.println("Maximum  = " + arr[arr.length - 1]);
        System.out.println("İkinci maximum = " + arr[arr.length - 2]);

    }
}
