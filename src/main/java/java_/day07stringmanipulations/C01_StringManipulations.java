package java_.day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {
        String s ="Learn Java earn money";

     boolean isEnd = s.endsWith("money");
        System.out.println("isEnd = " + isEnd);
        String s1 = s.replace("money", "dolar");
        System.out.println("s1 = " + s1);
        String s2 = s1.replace("earn", "win");
        System.out.println("s2 = " + s2);
        String s3 = s.replace("a", "*");
        System.out.println("s3 = " + s3);
        String s4 = s.replace("n", "***");
        System.out.println("s4 = " + s4);
        String s5 = s.replace("e","");
        System.out.println("s5 = " + s5);

        String t = "Yucel 25 ya$indadir sandik ama 30'mus!.";
        String t1 = t.replaceAll("[0-9]","*");
        System.out.println("t1 = " + t1);
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println("t2 = " + t2);
        String t3 = t.replaceAll("[^ ]", "+");
        System.out.println("t3 = " + t3);
        String t4 =t.replaceAll("[^a-z]", "?");
       System.out.println("t4 = " + t4);
       System.out.println(t.replaceAll("[^aeiouAEIOU]", "&"));


    }//main


}//class
