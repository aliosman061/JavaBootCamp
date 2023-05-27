package introduction.day03scanner;

public class Runner {
    public static void main(String[] args) {
        // Object nasıl oluşturulur?
        //Class ismi + object ismi + Atama operatoru + "new" +  Constructor





        Student tomHanks = new Student();

        System.out.println("tomHanks.name = " + tomHanks.name);
        System.out.println("tomHanks.grade = " + tomHanks.grade);
        System.out.println("tomHanks.address = " + tomHanks.address);
        tomHanks.feed();
        tomHanks.study();



    }
}
