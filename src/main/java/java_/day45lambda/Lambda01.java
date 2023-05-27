package java_.day45lambda;


import java.util.ArrayList;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);
        allEvenPrint(nums);
        System.out.println();
        anyMatchOddPrint(nums);
        System.out.println();
        enKucukIlk3AtlaKalan50Artis(nums);
        System.out.println();
        tekeleman(nums);
        System.out.println();
        tekElemanKare(nums);
        System.out.println();
        tekELemanKüp(nums);
        System.out.println();
        çiftElemanKüp(nums);
        System.out.println();
        ciftSayılarınKarelerininCarpimi(nums);
        System.out.println();
        listMax(nums);

    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.
    public static void allEvenPrint( List<Integer> nums ){

        boolean allEven= nums.
                stream().
                allMatch(t->t%2 == 0);
        System.out.println("allEven = " + allEven);//false
    }

    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz

    public static void anyMatchOddPrint( List<Integer> nums ){

        boolean anyOdd= nums.stream().anyMatch(t->t %2 != 0);
        System.out.println("anyOdd = " + anyOdd);

    }

    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.

    public static void enKucukIlk3AtlaKalan50Artis(List<Integer>nums){
        nums.stream().sorted().
               skip(3).map(t->t*1.5).
                forEach(t->System.out.print(t+" "));
    }



    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static  void tekeleman (List<Integer>nums){
        nums.stream().
                filter(t->2!=0).
                forEach(t->System.out.print(t+" "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static  void tekElemanKare(List<Integer>nums){
        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t -> System.out.print(t+" "));
    }


    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void tekELemanKüp (List<Integer>nums){
        nums.stream().distinct().filter(t->t%2!=0).map(t -> t*t*t).forEach(t -> System.out.print(t+" "));


    }


    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz

    public static void çiftElemanKüp (List<Integer>nums){
        int toplam =   nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println(toplam);
    }


    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static void ciftSayılarınKarelerininCarpimi (List<Integer>nums){
        int çiftKareCarpimi = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(Math::multiplyExact).get();
        System.out.print(çiftKareCarpimi);
    }


    //9)Liste ogelerinden max degerini veren bir method olusturunuz

    public static void listMax(List<Integer> nums){
        int max= nums.
                stream().
                reduce(Math::max).
                get();
        System.out.println(max);
    }


    //10)Liste ogelerinden minumum degerini veren method olusturunuz


}