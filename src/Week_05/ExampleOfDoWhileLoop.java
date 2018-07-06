package Week_05;

public class ExampleOfDoWhileLoop {

    public static void main(String[] args) {
        /*
        An example of a do-while loop that will loop 5 times, and display the
        current value of variable count
        */
        int count = 0;
        do {
            System.out.println("current value of count is: " + count);
            count++;
        } while (count < 5);

    }

}
