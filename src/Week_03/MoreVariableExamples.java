package Week_03;

import java.util.Scanner;

public class MoreVariableExamples {
    public static void main(String[] args) {
     
        /*
        Example of assigning false value to a boolean variable
        */
        boolean booleanFalseVariable = false;
        
        System.out.println(booleanFalseVariable);
        
        /*
        Example of assigning true value to a boolean variable
        */
        
        boolean booleanTrueVariable = true;
        
        System.out.println(booleanTrueVariable);
        
        /*
        Example of assigning a whole number to an integer variable
        */
        
        int luckyNumber = 13;
        
        System.out.println(luckyNumber);
        
        /*
        Example of assigning a whole negative number to an integer variable
        */
        
        int negativeLuckyNumber = -13;
        
        System.out.println(negativeLuckyNumber);
        
        /*
        Example of assigning a fraction number to a double variable
        */
        
        double fractionNumber = 3.14;
        
        System.out.println(fractionNumber);
        
        /*
        Example of assigning a negative fraction number to a double variable
        */
        
        double negativeFractionNumber = -3.14;
      
        System.out.println(negativeFractionNumber);
        
        /*
        Example of assigning a whole number to a String variable
        */
        
        String textNumber = "368";
        
        /*
        Example of performing a summation between a String variable and an Integer variable
        */
        
        System.out.println(luckyNumber+textNumber);
        
        /*
        Example of converting String number to an Integer variable 
        */
        
        int integerNumber = Integer.parseInt(textNumber);
        
        /*
        Example of adding two numbers together
        */
        
        System.out.println(luckyNumber+integerNumber);
        
        String textFraction = "3.56";
        
        /*
        Example of converting String variable into a double variable
        */
        
        double convertedFraction = Double.parseDouble(textFraction);
        
        System.out.println(convertedFraction);
        
        /*
        Examples of using Scanner to take different variable input for a user
        and storing the output in the variable
        */
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a whole number: ");
        
        int numberFromScanner = input.nextInt();
        
        System.out.println(numberFromScanner);
        
        System.out.println("Enter a fraction number: ");
        
        double fractionFromDouble = input.nextDouble();
        
        System.out.println(fractionFromDouble);
        
        /*
        Example of generating a random number between 1 and 5
        */
        
        System.out.println("Random number between 1 and 5");
        
        int i1 = (int)(1+Math.random() * 5);
        
        System.out.println(i1);

        
    } 
}
