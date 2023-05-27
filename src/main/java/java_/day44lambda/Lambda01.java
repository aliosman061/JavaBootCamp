package java_.day44lambda;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

        //Example 1 : Verilen text file icindeki text'i console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/main/java/java_/day44lambda/myTextFile.txt")).forEach(t-> System.out.println(t));

        //lines methodu Paths.get ile calisir.
        //Satirlar oldugu icin "ln" i silmedik
        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/main/java/java_/day44lambda/myTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);

        //Example 3 : Verilen text file icindeki text'lerde "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz
        boolean r1 = Files.lines(Paths.get("src/main/java/java_/day44lambda/myTextFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);


        //Example 4 : Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
        List<String> words = Files.
                lines(Paths.get("src/main/java/java_/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("\\p{Punct}","").
                        split(" ")).
                flatMap(Arrays::stream).
                distinct().
                collect(Collectors.toList());
        System.out.println(words);

        //flatMap() methodu arrayleri istenen sekle cevirir. Biz burada stream'e cevirdik

        //Example 5: Verilen text file icindeki text'de toplam kac harf kullanildigini gosteren kodu yaziniz.
        long numOfLetters = Files.
                lines(Paths.get("src/main/java/java_/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^a-zA-Z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();
        System.out.println(numOfLetters);
        /*
     Lambda da iki tür method var.
     1-Terminal Method: Kendisinden sonra method kabul etmez.sum(), count() gibi.
     2-Kendisinden sonra method kabul eden methodlar.
      */
        //Lambda'da da bazi methodlar kendisinden sonra method gosterirken bazilari kendisinden sonra method gostermez.
        // Bunlarin son method olarak kullanilmasi gerekir.Bunlara terminal method denir.

        //Example 6: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
        //  icinde return eden kodu yaziniz.
        List<String> letters =   Files.
                lines(Paths.get("src/main/java/java_/day44lambda/myTextFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]","")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(letters);




    }
}