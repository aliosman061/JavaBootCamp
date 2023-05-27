package java_.day03methodcreationscanner;

public class C03_MethodCreation {
    public static void main(String[] args) {
        //Dikdortgenin alanini hesaplatan bir method olusturunuz
        dikdörtgenAlanı(5, 10);
        kareninAlanı(12);
        System.out.println(kareninAlanı(12)*2);
        String  s1  = "Java Kolaydır";
        System.out.println(s1.toUpperCase());
        System.out.println('a'+'b');
         int harf = 'a';
        System.out.println(harf);

    }
    private static int kareninAlanı(int i) {
        return i * i;
    }

    private static void dikdörtgenAlanı ( int a, int b){
        System.out.println(a * b);
    }


}




