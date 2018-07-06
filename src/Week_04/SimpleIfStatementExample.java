package Week_04;

import java.util.Scanner;

public class SimpleIfStatementExample {
    public static void main(String[] args) {
        /*
        an example of if statement that will take an input from a user
        and display the day of the week depending on number
        */
        Scanner input = new Scanner(System.in);
        int dayOfWeek = input.nextInt();
        
        if(dayOfWeek == 1){
            System.out.println("Monday");
        }else if(dayOfWeek == 2){
            System.out.println("Tuesday");
        }else{
            System.out.println("Other day");
        }        
    }
  
}
