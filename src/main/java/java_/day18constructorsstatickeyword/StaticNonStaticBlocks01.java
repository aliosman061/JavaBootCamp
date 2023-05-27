package java_.day18constructorsstatickeyword;

import java.time.LocalDate;

/*
1) static blocklar static variablera ilk değerlerini atamak için kullanılır.
    2)"static" bir variable'a deger atamak icin kod yazmaniz gerekirse "static block" kullaniniz.
        3)"static" bir variable'a deger atamak icin yazilmasi gereken kod main method icine de yazilabilir ama
          "static block" icine yazilan kod "main method" icine yazilan kod'dan once calistirilir.
        4)Bir class'da bir'den fazla static block varsa ustteki once calistirilir.
 */
public class StaticNonStaticBlocks01 {
    //static variables static block kullanılmadan da initialize edilebilirler.

    public static double pi =3.14;

    // static variables static block kullanılarak da initialize edilebilirler.
    // asağıdaki gibi static  bir variable a değer atamak için kod yazmanız gerekirse statik block kulllanınız.
    public static double price ;

    static {
        LocalDate d = LocalDate.now();
        if (d.getMonthValue()==3){
            price =100;
        }else{
            price =1200;
        }
    }


}
