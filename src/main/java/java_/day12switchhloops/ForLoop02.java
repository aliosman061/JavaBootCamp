package java_.day12switchhloops;

public class ForLoop02 {
    public static void main(String[] args) {
        String b ="I love Java";

        for (int i = 0; i <b.length(); i++) {
            if (b.charAt(i) == 'a'){
                break;
            }
            System.out.print(b.charAt(i));
        }
        System.out.println();
        String s= "Germany";

        for (int i =s.length()-1 ;i>=0;   i--) {

            if (s.charAt(i) == 'a'){
                break;
            }
            System.out.print(s.charAt(i));
        }
       //

        }//main
}//class
