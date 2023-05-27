package java_.day44lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {
    public static void main(String[] args) throws IOException {

        //EX 1) Bir metin dosyasındaki tüm satırları okuyun ve ekrana yazdırın.
        System.out.println("Ex 1) ");
        Files.lines(Paths.get("src/main/java/java_/day44lambda/Txt.File")).forEach(System.out::println);


        // Ex 2) Bir metin dosyasındaki tüm satırları büyük harflerle okuyun ve ekrana yazdırın.
        System.out.println("Ex 2) ");
        Files.lines(Paths.get("src/main/java/java_/day44lambda/Txt.File")).
                map(t->t.toUpperCase()).forEach(System.out::println);

        // Ex 3) Bir metin dosyasındaki herhangi bir satırda "Java" kelimesi var mı yok mu kontrol edin.
        System.out.println("Ex 3) ");

        boolean varmı = Files.lines(Paths.get("src/main/java/java_/day44lambda/Txt.File")).anyMatch(t->t.contains("Java"));
                System.out.println(varmı);


        // Ex 4) Bir metin dosyasındaki tüm farklı kelimeleri bir liste içinde döndürün.
        System.out.println("Ex 4) ");
       List<String> uniq = Files.lines(Paths.get("src/main/java/java_/day44lambda/Txt.File")).flatMap(line-> Arrays.stream(line.split(" "))).
                map(word-> word.replaceAll("\\p{Punct}", "")).distinct().collect(Collectors.toList());
       System.out.print(uniq);


        // Ex 5) Bir metin dosyasındaki tüm harflerin sayısını hesaplayın.
//        System.out.println("Ex 5) ");
//        Long totalLetters = Files.
//                lines(Paths.get("src/main/java/java_/day44lambda/Txt.File")).
//                map(line->line.replaceAll("[^a-zA-Z]","")).//harfler haricindekiler silindi
//                        flatMap(line->Arrays.stream(line.split(""))).
//                count();//sayac gibi sayma islemi yapar
//        System.out.println("totalLetters = " + totalLetters);


        // Ex 6) Bir metin dosyasındaki tüm harfleri alfabetik olarak ters sırayla bir listeye ekleyin.
        System.out.println("Ex 6) ");
        List<String> alfabeikt= Files.lines(Paths.get("src/main/java/java_/day44lambda/Txt.File")).
                map(line -> line.replaceAll("[^a-zA-Z]","")).flatMap(line-> Arrays.stream(line.split(""))).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(alfabeikt);



    }
}
