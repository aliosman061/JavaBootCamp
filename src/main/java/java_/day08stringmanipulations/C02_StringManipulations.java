package java_.day08stringmanipulations;

public class C02_StringManipulations {
    public static void main(String[] args) {

    String str =" Hayirli Olsunda ";
        System.out.println(str.replaceFirst("a", "e"));

        System.out.println(str.trim());
        //verilen ismin ilk harfini ve soyismin ilk harfini yazdırınız.
        
        String tamİsim = "  mehmet fatih  ";
       char first = tamİsim.trim().toUpperCase().charAt(0);
        System.out.print( first);
        char first2 = tamİsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println( first2);


        
        


    }//main
}//class
