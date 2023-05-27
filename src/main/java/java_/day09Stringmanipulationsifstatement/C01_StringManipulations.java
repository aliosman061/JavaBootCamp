package java_.day09Stringmanipulationsifstatement;

public class C01_StringManipulations {
    public static void main(String[] args) {

        String str = "" ;
    boolean result1 = str.length() ==0;
    System.out.println(result1);
    boolean result2 = str.isEmpty();    
    System.out.println(result2);
    
    String t =" ";
    boolean result3 = t.replace(" ", "").isEmpty();
        System.out.println("result3 = " + result3);

        boolean result4 = t.isBlank();
        System.out.println("result4 = " + result4);
            
        String s="Java is easy to learn ";
        int result5 = s.indexOf('a');
        System.out.println("result5 = " + result5);
        String s2="Java is easy to learn to easy to";
        int result6 = s2.indexOf("to");
        System.out.println("result6 = " + result6);
        int result7 = s2.indexOf('e');
        System.out.println("result7 = " + result7);
        int result8 = s2.indexOf('p');
        System.out.println("result8 = " + result8);
        System.out.println("toplam = " +(result6+result5+result7+result8) );
        String cumle ="Ah Java vah java sen ne guzel seysin java";
        int indexJava =cumle.indexOf("Java");
        System.out.println(indexJava);
        String c = "Java is easy to learn";
        int aLast = c.lastIndexOf('a');
        System.out.println("aLast = " + aLast);
        int aLast1 = c.lastIndexOf('e');
        System.out.println("aLast1 = " + aLast1);
        int aLast3 = c.lastIndexOf('i');
        System.out.println("aLast3 = " + aLast3);
        System.out.println("sonuç ="+(aLast+aLast1+aLast3));


    }//main

}//class
