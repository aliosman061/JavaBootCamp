package java_.day15loopsarrays;

import java.util.Scanner;

public class nestedloop01 {

    public static void main(String[] args) {

        /*             1.Example:Type code to get the output like
                        Week: 1
                          Day: 1
                          Day: 2
                          Day: 3
                          .....
                        Week: 2
                          Day: 1
                          Day: 2
                          Day: 3
                          ....
                        Week: 3
                          Day: 1
                          Day: 2
                          Day: 3
                          .... */

        for(int i = 1; i <4; i++){
            System.out.println("Week: " + i);
                    for(int j = 1; j <8; j++){
                        System.out.println("   Day: " + j);
                    }
        }
        //Nested while-loop
        int i=1;
        while(i<3) {
            System.out.println("Week: " + i);
            int k = 1;
            while (k < 4) {
                System.out.println("   Day: " + k);
                k++;
            }
            i++;
        }



            /* 2.Example: Write a Java Program to Print Rectangle Star Pattern using For Loop
                          (Asagidaki sekli olusturmak icin bir java programi yazınız)
                        ****
                        ****
                        ****
            Note: Get the number of the rows and the columns from user */

            Scanner input = new Scanner(System.in);
            System.out.println("Please emter number of rows");
            int rows = input.nextInt();
            System.out.println("Please emter number of columns");
            int columns = input.nextInt();

            for(int j = 1; j <= columns; j++) {

                for (int v = 1; v <= rows; v++) {


                    System.out.print("*   ");
                }
                System.out.println();
            }


        System.out.println("Please enter row number");
        int row = input.nextInt();

        for(int m=1; m<=row; m++){

            for(int n=1; n<=m; n++){
                System.out.print(n+ " ");
            }
            System.out.println();

        }







    }//main
}//class
