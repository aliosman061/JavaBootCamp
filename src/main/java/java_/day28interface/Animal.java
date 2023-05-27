package java_.day28interface;

public interface Animal {
    void eat();
    void drink();
    //1)interfacelerdeki tüm variable lar otomatik olarak "final"dır.
    //bu yüzden  interface içindeki variable oluşturduğunuzda mutlaka değer atması yapmalısınız.
    //bilindiği gibi final variable ların değerleri değiştirilemez.
    //2)interfacelerdeki tüm variable lar otomatik olarak public dir.
    //3)interfacelerdeki tüm variablelar otomatik olarak staticdir.
    int age=4;
}
