package Week_19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextIO {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("resources/textoutput.txt"));
        while (input.hasNext()) {
            System.out.println(input.nextLine());
        }
    }
}