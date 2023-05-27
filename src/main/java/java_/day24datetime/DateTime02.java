package java_.day24datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlik zamani nasil aliriz?
        LocalTime myCurrentTime = LocalTime.now();
        System.out.println(myCurrentTime);//12:35:59.503894200

        //Anlik zamanda bilesenler nasil alinir?
        int hour = myCurrentTime.getHour();
        System.out.println(hour);//12

        int minute = myCurrentTime.getMinute();
        System.out.println(minute);//35

        int second = myCurrentTime.getSecond();
        System.out.println(second);//18

        int nano = myCurrentTime.getNano();
        System.out.println(nano);//54699200

        //Gelecek ve gecmis zamana nasil gidilir?
        LocalTime next=  myCurrentTime.plusMinutes(10).minusHours(1);
        System.out.println(next);

        //Zaman formati nasil degistirilir?
        // DateTimeFormatter.ofPattern() methodu kullanilarak degistirebiliriz

        /* DateTime Class ta kullanilan tarih saat formatlari
        HH : mm ==> 24 lu saat sistemi
        hh : mm ==> 12 li saat sistemi AM, PM gösterilmez
        hh : mm a ==> 12 li saat sistemi AM, PM
        hh : mm : ss ==> saniyeyi gosterir
        HH : MM ==> yanlis format cunku MM aylar icin kullanilir
        mm minute demektir, MM month demektir

        dd-MM-yyyy ==> gun - ay - yil
        MMM ==> Aug
        MMMM ==> August
        "yy" 23 seklinde bize verir
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("hh : mm : ss a");
        String formattedMyCurrentTime = dtf1.format(myCurrentTime);
        System.out.println(formattedMyCurrentTime);//13:02

        LocalDate myCurrentDate = LocalDate.of(2023,8,25);
        System.out.println(myCurrentDate);//2023-08-25

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        String formattedMyCurrentDate = dtf2.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate);//08/25/2023


        //ex tarihi gun / ay isimini ilk 3 harfi verecek şekle çeviiniz
        DateTimeFormatter dtf3 =DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf3.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);//25/Ağu/23

        //baska bir zaman dilimindeki tarih ve zamani nasıl alrız.
        //tokyo da ayın kacı

        LocalDate tokyoDate = LocalDate.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoDate);
       LocalTime tokyoTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(tokyoTime);

        System.out.println("Tarih : " + tokyoDate+ " "  +  "Saat : " + tokyoTime);

    }
}
