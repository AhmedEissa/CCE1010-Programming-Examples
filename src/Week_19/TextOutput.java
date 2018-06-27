package Week_19;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TextOutput {    
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter output = new PrintWriter("resources/textoutput.txt");
        output.println("Hello World! with println");
        output.print("Hello World with print");
        output.printf("\nHello %s with %s","World","printf");        
        output.close();
    }   
}