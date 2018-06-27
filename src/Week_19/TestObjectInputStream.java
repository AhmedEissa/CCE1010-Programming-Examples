package Week_19;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestObjectInputStream {

    public static void main(String[] args)
            throws ClassNotFoundException, IOException {
        try ( 
                ObjectInputStream input
                = new ObjectInputStream(new FileInputStream("resources/object.dat"))) {
            Sandwich sandwich = (Sandwich) input.readObject();
            System.out.println(sandwich.getBread());
            System.out.println(sandwich.getCheese());
        }
    }
}