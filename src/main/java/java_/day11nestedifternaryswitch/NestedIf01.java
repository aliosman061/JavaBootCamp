package java_.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age...");
        int age = input.nextInt();

        System.out.println("Please enter your gender...");
        String gender = input.next();

        if (age < 0 || age > 120) {
            System.out.println("Negative ages or ages greater than 120 are invalid");
        } else if (gender.equalsIgnoreCase("male")) {
            if (age > 65) {
                System.out.println("Can be retired");
            } else {
                System.out.println("Should work");
            }
        } else if (gender.equalsIgnoreCase("female")) {
            if (age > 60) {
                System.out.println("Can be retired");
            } else {
                System.out.println("Should work");
            }
        } else {
            System.out.println("Undefined gender");
        }

           /*
    1) "If" icinde "if" kullanirsaniz, "nested if" olusturmussunuz demektir.
    2) "Nested if" Java'yi yavaslatir bu yuzden mecbur kalmadikca kullanmayiz.
    3) "Nested if" gibi Java'yi yavaslatan kodlar "Time Consuming" olarak adlandirilir.
 */


    }//main


}//class
