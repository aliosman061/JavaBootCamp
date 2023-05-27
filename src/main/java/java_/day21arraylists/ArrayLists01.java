package java_.day21arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists01 {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Yozgat");
        cities.add("Barcelona");
        cities.add("Miami");
        cities.add("Giresun");
        cities.add("Giresun");
        cities.add("Yozgat");
        System.out.println(cities);//[Miami, Giresun, Yozgat, Barcelona, Miami, Giresun, Giresun, Yozgat]

        //ArrayList'te bir elemanin ilk gorunumu nasil silinir?
        // remove() methodu bir elemanın ilk gorunumunu siler
        System.out.println(cities.remove("Miami"));
        System.out.println(cities);

        //Arraylist te bir eleman indexi kullanarak nasıl silinir?
        System.out.println(cities.remove(2));
        System.out.println(cities);


        //remov () methodu eleman ile kullanılırsa ilk gorunumu siler
        //remov () methodu eleman ile kullanılırsa size o elemanı silip silmedigini ifade eden true yada false verir

        // Example: Bir Integer Listini olusturun ve 12 elemanı siliniz
        //Arraylist olusturulurken sag tarafa (constructor) Arraylist yazmak zorundayız
        //Ama sol tarafa ister Arraylist yazın ister List yazın ikiside calısır
        //Detayları Collections konusunda gorecegiz

        List<Integer> ages = new ArrayList<>();
        ages.add(23);
        ages.add(12);
        ages.add(7);
        ages.add(4);

        // ages.remove(12);
        //  System.out.println(ages);

        //1.Yol
        // Integer nonPrimitive = 12;
        // ages.remove(nonPrimitive);
        // System.out.println(ages);

        //2.Yol
        ages.remove((Integer) 12);
        System.out.println(ages);


        //3 yol
        // ages.remove(ages.indexOf(12));
        // System.out.println(ages);

        //Kısa yoldan bir List olusturmak icin List.of() methodunu kullanabiliriz
        //List.of() methodu degistirilemez bir liste olusturulmak icin kullanılır
        // bu method ile olusturulan list degistirmeye yonelik methodları desteklemez

        List<Character> initials = List.of('a', 'b', 'a', 'c', 'd');
        System.out.println(initials);
        // initials.add('e');
        // initials.remove(0);
        // initials.set(0,'u');
        System.out.println(initials);
        //indexOf(aranan karakter) methodu bir aranan karakterin ilk gorunumunun index ini verir
        int r1 = initials.indexOf('c');
        System.out.println(r1);

        //lastIndexOf() methodu aranan karakterin son gorunumunun index ini verir
        int r2 = initials.lastIndexOf('a');
        System.out.println(r2);

        //Example 2: Bir listteki tekrarsiz elemanlari console a yazdiriniz

        List<Double> prices = List.of(2.5, 2.5, 3.75);

        //2.5, 2.5, 3.75
        for (Double w : prices) {

            if (prices.indexOf(w) == prices.lastIndexOf(w)) {
                System.out.print(w + " ");//3.75 4.0

            }
        }
        System.out.println();

        //Example 3: Bir list te tekrarli eleman olup olmadigini gosteren kodu yaziniz
        List<Integer> heights = List.of(3, 13, 3);

        int counter = 0;

        for (Integer w : heights) {

            if (heights.indexOf(w) != heights.lastIndexOf(w)) {
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("All elements are unique in the list");
        } else {
            System.out.println("At least one element is not unique in the list");
        }

    }
}
