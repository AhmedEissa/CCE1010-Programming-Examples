package Week_19;

import java.io.*;

public class TestObjectOutputStream {

    public static void main(String[] args) throws IOException {
        try (
                ObjectOutputStream output
                = new ObjectOutputStream(
                        new FileOutputStream("resources/object.dat"))) {
            Sandwich sandwich = new Sandwich("White","Edam");
            output.writeObject(sandwich);
        }
    }
}