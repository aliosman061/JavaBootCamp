package java_.day27interface;

public interface Brake  {
    void slow();
    void payment();
    default void eco(){
        System.out.println("Uses gas less...");
    }
}
