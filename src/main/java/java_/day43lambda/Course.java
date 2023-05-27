package java_.day43lambda;
/*
içinde;
1) private variable'lar
2) parametreli ve parametresiz constructorlar
3)getter'lar
4)setter'lar
5)toString() method'u
barındırıdan classlara "POJO" class denir
pojo: Plain Old Java Object
 */
public class Course {
    private String courseName;
    private int numOfStudents;
    private String season;
    private double averageScore;

    public Course(String courseName, int numOfStudents, String season, double averageScore) {

        this.courseName = courseName;
        this.numOfStudents = numOfStudents;
        this.season = season;
        this.averageScore = averageScore;
    }
    public Course() {
    }
    public String getCourseName() {
        return courseName;
    }
    public int getNumOfStudents() {
        return numOfStudents;
    }
    public String getSeason() {
        return season;
    }
    public double getAverageScore() {
        return averageScore;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }
    public void setSeason(String season) {
        this.season = season;
    }
    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    @Override
    public String toString() {//Object'i olustururken tum ozellikleri ile gorup yazdirabilmemi icin toString
                              // methodunu yine generate'den secip olusturduk.
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", numOfStudents=" + numOfStudents +
                ", season='" + season + '\'' +
                ", averageScore=" + averageScore +
                '}';
    }
}
