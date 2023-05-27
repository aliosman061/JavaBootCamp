package b151practices.day_12_pracitice;

public class C01 {
    String isim="Hasim";

    int yas =20;
    public  C01(String isim, int yas) {

    }

    public C01() {

    }

    public static void main(String[] args) {
        C01 obj1=new C01("Nuri",25);
        System.out.println(obj1.isim+", "+ obj1.yas);
        C01 obj2=new C01();
        //her classta default constructor vardır.
        //fakat biz bulunduğumuz classda kendimiz bir constructor oluşturursak, bu durumuda default constructor ölür(silinir).

    }
}
