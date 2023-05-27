package introduction.day02datatypesmethodcreation;

import java.security.PublicKey;

public class MethodCreation01 {
   /* javada method nasıl oluşuturulur.
   1) main method'un dışında oluşturulur.
   2) Access Modifier + return type + Method İSmi + ()+ {}
   oluşturulan methodlar nasıl kullanılır.
   */
   public static void main(String[] args) {
      int sonuc = toplamaYap( 7,15);
      System.out.println(sonuc);

      long sonuuc = carpmaYap(1,9);
      System.out.println(sonuuc);
      int sonucc = islemYap(5,6,9);
      System.out.println(sonucc);
      double son = islem(3.5);
      System.out.println(son);
      print("merhaba kardeş");

   }
   public static int toplamaYap (int a, int b) {return a+b;

   }
   protected static long carpmaYap (int a, int b){
      return a*b;
   }

   private static int islemYap (int a,int b,int c) {return  a * b + c;}

 static double islem (double a) {return a * a * a;}
   public static void kelime (String str){
      System.out.println(str);
   }
   private static void print (String str){
      System.out.println(str);
   }
}
