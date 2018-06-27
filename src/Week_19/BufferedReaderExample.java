package Week_19;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {

    public static void main(String[] args) throws IOException{
        String line;
        /*
        BufferedReader encapsulates the FileReader which will perform the file operations
        This example also shows the try-catch with resources
        therefore there is no need to use the close method
        the try-catch with resources will perform the closing operations
        */
        try (BufferedReader bufferedReader = 
                new BufferedReader(
                        new FileReader("resources/myfile.txt"))) {
            /*
            The while loop will continue on reading the data until it reaches a 
            line that doesn't contain any files and will return null value
            */
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }            
        }
    }
}