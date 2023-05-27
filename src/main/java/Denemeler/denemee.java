package Denemeler;

public class denemee {
    public static void main(String[] args) {
        String a="Time is money";
        String ters="";

        for (int i = a.length()-1; i >=0 ; i--) {

            ters=ters+a.substring(i,i+1);
        }
        System.out.println(ters);


        StringBuilder t =new StringBuilder("Time is money");


        System.out.println(t.reverse());


        String numbers="012345678";
        System.out.println(numbers.substring(7));



    }
}
