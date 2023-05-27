package introduction.day04scannerwrapperoperators;

public class WrapperClass {
    public static void main(String[] args) {

        int  intMin = Integer.MIN_VALUE;
            int num = 13;
        Integer wrapperNum = num;
        System.out.println(wrapperNum);
        Byte wrapperNum1 = 113;
        byte num1 = wrapperNum1;
        System.out.println(num1);

        char isim = 'A';
        Character isim1 = isim;
        System.out.println(isim1);
        Boolean emeklimisin = true ;
        boolean emekli = emeklimisin;
        System.out.println(emekli);

    }
}
