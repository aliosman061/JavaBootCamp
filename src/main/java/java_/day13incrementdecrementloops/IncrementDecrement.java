package java_.day13incrementdecrementloops;

public class IncrementDecrement {

    public static void main(String[] args) {
     //Increment
        int a =5;
        System.out.println(a);
        a =a + 2;
        System.out.println(a);


         int b = 10;
        System.out.println(b);


        b+=2;
        System.out.println(b);
     //Decrement

     int c =8;
     c=c-3;
     System.out.println(c);
     c-=3;
        System.out.println(c);

        // İncrement2

        int d =10;
        d*=2;
        System.out.println(d);

       // decrement2

        double  e =10;
        e/=2;
        System.out.println(e);

        int p =17;
        int r =p--;
        System.out.println(p);
        System.out.println(r);
        //"1" ile increment
        int f = 12;

        //f=f+1;
        // f+=1;
        f++;

        //"1" ile decrement
        int h = 10;

        // h=h-1;
        // h-=1;
        h--;

        //post-increment ve pre increment

        int i = 10;
        int k = i++;     //post-increment cunku variable isminden sonra increment islemi yapildi

        System.out.println(k);//10 ==> "i" artirilmadan k sepetine konuldugu icin k nin degeri 10 olur
        System.out.println(i);//11 ==> "i" satir sonunda artirildigi icin "i" nin degeri 11 olur

        int m = 15;
        int n = ++m;    ////pre-increment cunku variable isminden önce increment islemi yapildi
        System.out.println(m);//16 ==> "m" satir sonunda artirildigi icin "m" nin degeri 16 olur
        System.out.println(n);//16 ==> "m" artirildiktan sonra n sepetine konuldugu icin "n" nin degeri 16 olur

//       //Example
//        int p = 17;
//        int r = p--;

        System.out.println(p);
        System.out.println(r);

        int s = 20;
        int t = --s;

        System.out.println(s);//19
        System.out.println(t);//19

        /*
         *  1) Increment artirmak demektir Decrement azaltmak demektir
         *  2) Incerement toplama ve carpma ile Decrement cikarma yada bolme ile yapilabilir
         *  3) Increment ve Decrement 3 yolla yapilabilir
         *
         *       a)  int i = 12; ==> i = i +5;
         *       b)  int i = 12; ==> i +=5;
         *       c)  int i = 12; ==> i++;
         *           Note : 3. yol sadece 1 artirmak icin kullanilabilir
         *
         *
         *       a)  int i = 12; ==> i = i -5;
         *       b)  int i = 12; ==> i -=5;
         *       c)  int i = 12; ==> i--;
         *           Note : 3. yol sadece 1 azaltmak icin kullanilabilir
         *  */





    }//main


}//class
