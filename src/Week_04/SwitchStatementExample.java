package Week_04;

import java.util.Scanner;

public class SwitchStatementExample {

    public static void main(String[] args) {
        /*
        An example of switch statement that will take an input from a user
        and display a day of the week depending on number selected.
        */
        Scanner input = new Scanner(System.in);
        int dayOfWeek = input.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Other day");
        }

    }

}
