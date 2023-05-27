package java_.day27interface;

public class Honda implements Engine, Brake {
    @Override
    public void start() {
        System.out.println("Start...");
    }
    @Override
    public void payment() {
        System.out.println("Pay the brake...");
        System.out.println("Pay the engine...");
    }

    @Override
    public void eco() {
        Engine.super.eco();
    }

    @Override
    public void slow() {
        System.out.println("Be slow...");
    }


}