package java_.day42lambda;

import java_.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {
    public static void main(String[] args) {


        System.out.println(getSumInTheGivenRange(7, 10));
        System.out.println(get(7, 10));
        System.out.println(getSumOfDigitsInTheGivenRange(45, 47));


    }
    //swap için bir tane private method oluştur.
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }

//Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz
    public static int getSumInTheGivenRange(int starting, int ending){
//        if (starting>ending){// amaç kullanıcı ilk sayıyı büyük yazarsa yer değiştirmek.
//            starting=starting + ending;
//            ending=starting - ending;
//            starting = starting - ending;
//        }
        swap(starting, ending);

        return  IntStream.rangeClosed(starting, ending).sum();
    }
    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.
    public static int get (int starting, int ending){
        //        if (starting>ending){// amaç kullanıcı ilk sayıyı büyük yazarsa yer değiştirmek.
//            starting=starting + ending;
//            ending=starting - ending;
//            starting = starting - ending;
//        }
        swap(starting, ending);

        return IntStream.rangeClosed(starting, ending).reduce(Math::multiplyExact).getAsInt();
    }
    //Example 3: 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    public static int getSumOfDigitsInTheGivenRange (int starting, int ending){
        //        if (starting>ending){
//            starting=starting + ending;
//            ending=starting - ending;
//            starting = starting - ending;
//        }
        swap(starting, ending);
        return IntStream.rangeClosed(starting, ending).map(Utils::getSumOfDigit).sum();
    }



}
