package Week_19;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderExample {

    public static void main(String[] args) throws Exception {
        String line;
        try (BufferedReader bufferedReader = 
                new BufferedReader(
                        new FileReader("resources/myfile.txt"))) {
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }            
        }
    }
}