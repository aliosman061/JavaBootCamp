package java_.day18constructorsstatickeyword;

public class Student {
    public static int numOfRegisterStd =0;
    public  int num = 0;

    public Student() {
        numOfRegisterStd++;
        num++;
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        System.out.println(numOfRegisterStd);
        System.out.println(s1.num);
    }


}
