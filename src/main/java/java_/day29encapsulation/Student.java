package java_.day29encapsulation;

public class Student {
    private String stdId ="AC2023102T";
    public int age =19;

    private double notOrt =3.53;
    private boolean succesful =false;

    public String getStdId(){
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
