package Week_14;

public class StudentNoIheritance {

    private int age;
    private String name;
    private char gender;
    private String studentNumber;
    private String course;
    private String hobby;

    public StudentNoIheritance(int age, String name, char gender, String studentNumber, String course, String hobby) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.studentNumber = studentNumber;
        this.course = course;
        this.hobby = hobby;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
