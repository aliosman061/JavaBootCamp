package Denemeler.deneme01;

import java.util.Arrays;

public class ArrayDeneme {
    public static void main(String[] args) {

int arr1 []={0,2,3,3,1,4,4,2,0};


        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        System.out.println(Arrays.binarySearch(arr1,2));
        int arr[] = {22,1,2, 0,23,1, 32, 2, 3};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.binarySearch(arr, 1));


        char arr3[] =new char[4];
        arr3[0] ='A';
        arr3[2] ='E';
        arr3[3] ='M';
        System.out.println(Arrays.toString(arr3));


        String str="cok calis, mutevazi ol";
        String strArray[] = str.split(",");
            System.out.println(Arrays.toString(strArray));

            String strArray2[] = str.split("X");
            System.out.println(Arrays.toString(strArray2));




    }
}
