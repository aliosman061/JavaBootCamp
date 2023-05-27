package java_.day17multidimensionalarray;

import java.util.Arrays;

public class MD02 {
    public static void main(String[] args) {

    //ex 4 : İki boyutlu bşr array i tek boyutlu bir arraye çeviriniz.

    int numbers[] []={{5,4}, {2,3,2}};
    //1. step tek boyutlu arrayde öncelikle kaç eleman olduğunu dynamic olarak bulalım.
    int toplamElemanSayısı=0;

    for ( int[] w : numbers ) {
        toplamElemanSayısı = toplamElemanSayısı + w.length;
    }
        System.out.println(toplamElemanSayısı);

    //2. step: tek boyutlu arrayi elde eetiğimiz eleman sayısı kullanara oluşturalım.
        int newArr[] = new int [toplamElemanSayısı];

    //3. step: iki boyutlu arraydeki elemanları tek boyutlu arraye transfer edelim
    int idx=0;

        for (int [] w : numbers) {
            for (int k : w) {
                newArr[idx]=k;
                idx++;
            }

        } System.out.println(Arrays.toString(newArr));



        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47
        int small = ages[0][0];     //{ {15, 4}, {12, 43, 21} }
        int big = ages[0][0];

        for ( int []  w :    ages    ) {

            for ( int k : w   ) {

                small = Math.min(small,k);
                big = Math.max(big,k);

            }
        }
        System.out.println(small+big);







    }//main
}//class
