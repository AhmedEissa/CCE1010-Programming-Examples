package Week_08;

public class ArrayExample {

    public static void main(String[] args) {

    }

    /*
        An example of how to write into array by accessing each array block directly
     */
    public static void writingToArrayExample1() {
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
    }

    /*
    Example of writing into an array by use of a for loop
     */
    public static void writingToArrayExample2() {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
        }
    }

    /*
    Example of writing/initializing an array
     */
    public static void writingToArrayExample3() {
        int[] numbers;
        numbers = new int[]{1, 2, 3, 4, 5};
    }

    /*
    Example of writing into an array using a for loop and 
    reading from array using a for loop
     */
    public static void readingFromArrayExample1() {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }

    /*
    Example of writing into an array using a for loop
    and reading from array by selecting seperate blocks of array
     */
    public static void readingFromArrayExample2() {
        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
        }

        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
    }
    
    /*
    An example of combination of if statement and for loop to find smallest 
    value out of integer array
    */

    public static void smallestValueInArray() {
        int[] anArray = {234, 124, 45, 67, 23, 98, 17, 144};
        int smallestValue = anArray[0];
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] < smallestValue) {
                smallestValue = anArray[i];
            }
        }
        System.out.println("smallest value is: " + smallestValue);
    }
}
