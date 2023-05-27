package java_.day24datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {

       LocalDateTime ldt= LocalDateTime.now();
        System.out.println(ldt);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MMM-yyyy - HH:mm a");
        String son= dtf.format(ldt);
        System.out.println(son);



    }
}
