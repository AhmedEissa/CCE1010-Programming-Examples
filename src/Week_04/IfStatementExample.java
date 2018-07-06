package Week_04;

import java.util.Scanner;

public class IfStatementExample {

    public static void main(String[] args) {
        /*
        An example of if statement that will take an input from the user
        and display the grade depending on the score that the user provided
        */
        
        System.out.println("Please enter the score");
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score >= 40 && score<=49) {
            System.out.println("Pass");
        } else if (score >= 50 && score <= 69) {
            System.out.println("Merit");
        } else if (score >= 70 && score <= 100) {
            System.out.println("Distinction");
        } else if (score < 39) {
            System.out.println("Fail");
        } else {
            System.out.println("Incorrect input");
        }
    }

}
