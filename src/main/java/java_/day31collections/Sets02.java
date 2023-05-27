package java_.day31collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Sets02 {
    public static void main(String[] args) {
        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.
        //1.yol ama
        TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("t@gmail.com");
        emails.add("g@gmail.com");
        emails.add("x@gmail.com");
        emails.add("e@gmail.com");
        emails.add("b@gmail.com");
        emails.add("c@gmail.com");
        System.out.println(emails);
        long t2 =System.nanoTime();

        //2. yol Recommended

        HashSet<String> email= new HashSet<>();
        email.add("a@gmail.com");
        email.add("t@gmail.com");
        email.add("g@gmail.com");
        email.add("x@gmail.com");
        email.add("e@gmail.com");
        email.add("b@gmail.com");
        email.add("c@gmail.com");
        System.out.println(email);


        TreeSet<String> emailTs = new TreeSet<>(email);
        System.out.println(emailTs);
        long t3=System.nanoTime();

        System.out.println(t3 - t2);


    }
}
