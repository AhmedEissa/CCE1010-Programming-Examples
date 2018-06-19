package Week_14;

public class Teacher extends Person{
    
    private String staffNumber;
    private String moduleNumber;         

    public Teacher(String staffNumber, String moduleNumber, int age, String name, char gender,String hobby) {
        super(age, name, gender, hobby);
        this.staffNumber = staffNumber;
        this.moduleNumber = moduleNumber;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber;
    }

    public String getModuleNumber() {
        return moduleNumber;
    }

    public void setModuleNumber(String moduleNumber) {
        this.moduleNumber = moduleNumber;
    }   
    
    @Override
    public void socialStatus(){
        System.out.println("This is a tutor!");
    }
}
