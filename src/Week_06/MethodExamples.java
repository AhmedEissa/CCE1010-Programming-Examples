package Week_06;

public class MethodExamples {

    /*
    the main method is used to start the program
     */
    public static void main(String[] args) {
        printingMessage();
        printingMessageWithParameter("Hello World!");
        int c = addition(2, 2);
        System.out.println(c);
    }

    /*
    An example of void method used for purpose of performing 
    a single operation of printing out Hello World!
     */
    public static void printingMessage() {
        System.out.println("Hello World!");
    }

    /*
    An example of void method that will print out a String parameter pass to it
     */
    public static void printingMessageWithParameter(String message) {
        System.out.println(message);
    }

    /*
    An example of return method that will return output of summation of two numbers
     */
    public static int addition(int a, int b) {
        return a + b;
    }

}
