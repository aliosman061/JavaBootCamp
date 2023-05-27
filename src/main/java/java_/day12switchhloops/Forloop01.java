package java_.day12switchhloops;

public class Forloop01 {
    public static void main(String[] args) {
        //ex 1; 21 den 180e kadar hem 4 hemde 6 ile bölünebilen tam sayıları ekranada yazdıran kodu yazınız

        for (int i = 21; i < 181; i++) {
            if (i%4==0 && i%6==0) {
                System.out.print(i+"-");
            }

        }
        System.out.println();
        String s = "ankara";
        for (int i = 0; i<s.length(); i++) {
            String ch = s.substring(i,i+1);
            if (i%2==0){
                System.out.print(ch.toUpperCase());
        }

        }





    }//main
}//class
