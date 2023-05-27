package java_.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {
        
        String a ="Benim Tek Rakibim Dunku Ben";
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);
        
        String alower =a.toLowerCase();
        System.out.println("alower = " + alower);

        System.out.println("aUpper = "+(a.charAt(0)) );
        System.out.println(a.charAt(10));
        System.out.println(a.length());
        String sub1 =a.substring(0,4);
        System.out.println("sub1 = " + sub1);
        System.out.println(a.substring(4,7));
        System.out.println(a.substring(10));
        boolean varMi = a.contains("bim");
        System.out.println("varMi = " + varMi);
        System.out.println(a.startsWith("T"));
        System.out.println(a.startsWith("Tek", 6));
    }//main
}//class
