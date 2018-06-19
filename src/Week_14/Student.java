package Week_14;

public class Student extends Person{
   private String studentNumber;
   private String course;

    public Student(int age, String name, char gender, String studentNumber,
            String course, String hobby) {
        super(age, name, gender,hobby);
        this.studentNumber = studentNumber;
        this.course = course;
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
    
   @Override
    public void socialStatus(){
        System.out.println("This is a student!");
    }
}