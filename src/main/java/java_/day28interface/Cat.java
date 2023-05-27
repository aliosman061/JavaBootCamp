package java_.day28interface;

public class Cat implements Mammal{
    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);
    }
}
