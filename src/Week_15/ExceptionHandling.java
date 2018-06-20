package Week_15;

public class ExceptionHandling {

    public static void main(String[] args) {
        /*try with multiple catch blocks
        this is a try-catch-finally block which will call finally block 
        even if the code will throw an exception.
        In case of this example the finally block will call method called endOfMethods.
         */
        try {
            callExceptionMethods();
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        } catch (ArrayIndexOutOfBoundsException ex) {
            ex.printStackTrace();
        } finally {
            endOfMethods();
        }
    }

    /**
     * *
     * This method will be used to call all the methods in this class containing
     * different ways to catch exceptions
     *
     * @throws InterruptedException is caused because of use Thread.sleep which
     * puts the program to sleep for 1 second
     * @throws ArrayIndexOutOfBoundsException is caused because the for loop
     * tried to read 6th array block from array that only contains 5 arrays
     */
    public static void callExceptionMethods() throws InterruptedException, ArrayIndexOutOfBoundsException {
        exceptionWithTryCatch();
        Thread.sleep(1000);
        try {
            exceptionWithThrowsAndTryCatch();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Catching exception in main method: \n" + e);
        }
        Thread.sleep(1000);
        exceptionWithThrows();
    }

    /**
     * *
     * This is an example of method that throws exception for entire method. The
     * method calling this method will have to handle the exception.
     *
     * @throws ArrayIndexOutOfBoundsException
     */
    public static void exceptionWithThrowsAndTryCatch() throws ArrayIndexOutOfBoundsException {
        char[] matrix = new char[]{'H', 'e', 'l', 'l', 'o'};
        System.out.println(matrix);

        for (int i = 0; i <= matrix.length; ++i) {
            System.out.println(matrix[i]);
        }
    }

    /***
     * This method will check for exceptions on a certain portion of the code.
     * The calling method doesn't throw or catch any exceptions, as they are being
     * handled by this method itself.
     */
    public static void exceptionWithTryCatch() {
        char[] matrix = new char[]{'H', 'e', 'l', 'l', 'o'};
        System.out.println(matrix);
        try {
            for (int i = 0; i <= matrix.length; ++i) {
                System.out.println(matrix[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This is an exception thrown by catch in "
                    + "exceptionWithTryCatch: \n" + e);
        }
    }
    /***
     * This method doesn't use try-catch block but instead it checks for errors using 
     * if statement. Then when the error is discovered it will throw a new exception.
     */
    public static void exceptionWithThrows(){
        char[] matrix = new char[]{'H', 'e', 'l', 'l', 'o'};
        System.out.println(matrix);

        for (int i = 0; i <= matrix.length; ++i) {
            if (i == matrix.length) {
                throw new ArrayIndexOutOfBoundsException("Incorrect for loop operators");
            } else {
                System.out.println(matrix[i]);
            }
        }
    }
    /***
     * Method that is called by finally block from main method
     */
    public static void endOfMethods() {
        System.out.println("Last method called using finally clause");
    }
}
