package Week_14;

public class Person {
    private int age;
    private String name;
    private char gender;
    private String hobby;

    public Person(int age, String name, char gender, String hobby) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.hobby=hobby; 
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

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    
    public void socialStatus(){
        System.out.println("This is a common person!");
    }
    
    
    
}
