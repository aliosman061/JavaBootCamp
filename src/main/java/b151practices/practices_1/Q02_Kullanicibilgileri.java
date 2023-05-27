package b151practices.practices_1;

public class Q02_Kullanicibilgileri {
    public static void main(String[] args) {

        /** first name, last name, age, height ve weight değişkenlerini konsola aşağıdaki gibi yazdıran bir kod yazınız:
         First Name: ...
         Last Name : ...
         Age: ...
         Height: ...
         Weight: ...
         Not: Sadece bir adet "System.out.println(); kullanınız. **/

        String firstName = "Ali";
    String lastName ="Yılmaz";
    int age= 30;
    double height = 1.90;
    double weight = 100;

        System.out.println("First Name: "+firstName+"\nLast Name : "+lastName+"\nAge: "+age+"\nHeight: "+height+"\nWeight: "+weight);

/*
        /*  double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
       Bu sayıların ortalamasını hesaplayan bir kod yazınız.
     */
        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
     double ortalama = (num1+num2+num3+num4+num5)/5;
        System.out.println("ortalama = " + ortalama);

        double num0 = 61;
        System.out.println("Anil= "+ num0);

    }


}
