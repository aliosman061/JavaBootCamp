package java_.day18constructorsstatickeyword;

public class StudentRunner {
    public static void main(String[] args) {
    // static olan "numOfRegisteredStd" variable'ini çağırmak için sadece claas ismini kullandık,object oluşturmak için.
        System.out.println(Student.numOfRegisterStd);

        // static olmayan "num" variable ini çağırmak için object oluşturduk.
        Student s1 =new Student();
        System.out.println(s1.num);


    }
}
