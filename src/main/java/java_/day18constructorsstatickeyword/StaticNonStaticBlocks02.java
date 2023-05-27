package java_.day18constructorsstatickeyword;

public class StaticNonStaticBlocks02 {

    public StaticNonStaticBlocks02(){
        System.out.println("constructor 1");

    }
    public StaticNonStaticBlocks02(int price){
        System.out.println("constructor 2");
    }
    public StaticNonStaticBlocks02(String name){
        System.out.println("constructor 3");
    }
    public StaticNonStaticBlocks02(boolean isOld){

        System.out.println("constructor 4");
    }
    // //non-static block constructor'larda calistirilmasi gereken "ortak kod"lari icerir.
    //    //non-static block icine yazilan kod'lar her constructor icin calistirilir.
    //    //Bir'den fazla non-static block varsa ustteki once calistirilir.


    {
        System.out.println("I am Constructor");
    }

    public static   void main(String[] args){
        StaticNonStaticBlocks02 obj1 = new StaticNonStaticBlocks02();
        StaticNonStaticBlocks02 obj2= new StaticNonStaticBlocks02(12);
        StaticNonStaticBlocks02 obj3= new StaticNonStaticBlocks02("Shirt");
        StaticNonStaticBlocks02 obj4= new StaticNonStaticBlocks02(false);


    }





}
