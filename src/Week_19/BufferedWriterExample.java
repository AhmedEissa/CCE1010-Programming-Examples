package Week_19;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

    public static void main(String[] args) throws IOException {

    String str = "Hello world!";
    BufferedWriter writer = new BufferedWriter(
            new FileWriter("resources/myfile.txt",true));
    //add true at the end of file writer to append the file
//    BufferedWriter writer = new BufferedWriter(
//            new FileWriter("resources/myfile.txt",true));
    writer.newLine();
    writer.write(str);
    writer.close();
    }
}
