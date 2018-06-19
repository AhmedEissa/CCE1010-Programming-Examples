package Week_14;

public class Teacher extends Person{
    
    private String staffNumber;
    private String moduleNumber;    
    private String officeNumber;

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
    
        public String getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(String officeNumber) {
        this.officeNumber = officeNumber;
    }
    
    //This is an example of Override
    //it allows to override a methods that is located in a superclass
    //so for example if a socialStatus is different between person and tutor
    //we can specify this using an overridden method
    @Override
    public void socialStatus(){
        System.out.println("This is a tutor!");
    }
    //This is an example of overloading a method
    //we have two methods called teachersOfficeNumber
    //one with out of parameter
    //and the other with a parameter
    //this allows us to have two methods with same name
    //in the same class.
    public void teachersOfficeNumber(){
        System.out.printf("Office number is: %s", getOfficeNumber());
    }
    
    public void teachersOfficeNumber(int repeat){
        for (int i = 0; i < repeat; i++) {
            System.out.printf("Office number is: %s", getOfficeNumber());    
        }       
    }

    
    
    
}
