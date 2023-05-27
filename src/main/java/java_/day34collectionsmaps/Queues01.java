package java_.day34collectionsmaps;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        // İlk giren ilk çıkar mantıgıdır. (First in first out.) FİFO
        // Sıralamanın degişmemesi gerekir, araya eleman eklenemez. Yoksa kural bozulur.
         /*Queue bir interface dir, bu yuzden constructor i yoktur, dolayisiyla object olustururken new keywordunden sonra kullanilamaz
        Datatype "Queue" olan bir object olusturmak icin new keywordden sonra
            a)Linkedlist veye b) PriorityQueue classlari kullanilabilir

         Queue olustururken constructor olarak PriorityQueue kullanirsaniz elemanlari kendi
          belirleyeceğiniz kurala gore siralama hakkiniz olur.
        */


        Queue<String> wareHouse = new LinkedList<>();   // queue= kuyruk
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Chese");
        System.out.println(wareHouse);  // [Milk, Meat, Egg, Bread, Chese]

        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]

        System.out.println(wareHouse.peek());//Meat
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]


        System.out.println(wareHouse.element());//Meat
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]

        wareHouse.clear();

        // System.out.println(wareHouse.element());Exception
        System.out.println(wareHouse.peek());//null
    }
}
