package Week_14;

import java.util.ArrayList;

public class Admin {

    public static void main(String[] args) {
        
        //sub class student extended with Person super class
        Student student = new Student(20, "Monica", 'f', "M00123456", "BSc Computer Science","Trips to Spain");
        
        //same class as Student class but without of inheritance 
        StudentNoIheritance studentNoIheritance = new StudentNoIheritance(18, "John", 'm', "M00654321", "BSc Computer Networks","Cars");

        //another sub class extended with Person class
        Teacher teacher = new Teacher("S0012345", "CCE1010", 28, "Matthew", 'm',"Board Games");
        
        //Super class on its own
        Person person = new Person(54,"Jenifer",'f',"N/A");
       
        //example of Polymorphism where Student class can be assigned to Person class
        //this is because Student class inherit some functions from Person class.
        Person person1 = new Student(21, "Bob", 'M', "M00123654", "BA Business Management","Pottery");
        
        //This is ArrayList of Person type
        //This array can only store object of type of Person,
        //or objects that inherit from Person object
        //this allows us to store all of our objects created abouve expect 
        //StudentNoIheritance object which didn't inherit anything from Person class.
        ArrayList<Person> personArrayList = new ArrayList<>();
        
        //To add item/s to ArrayList we use an add method
        //To remove item/s from ArrayList we use remove method
        personArrayList.add(student);
        personArrayList.add(teacher);
        personArrayList.add(person);
        personArrayList.add(person1);
        
        //this is for each loop, this loop will iterate through out the entire 
        //ArrayList until it reaches the end of the loop
        //This for each loop will print out social status of each object
        //notice that the social status will be different for each object
        //even though each object is of Person data type
        //this is because each object has overwritten the socialStatus method
        //that was inheriten of Person class.
        for(Person personForLoop : personArrayList){
            personForLoop.socialStatus();
        }
    }   
}
