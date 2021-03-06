package Week_09;

public class Array2D {

    public static void main(String[] args) {
        randomShuffling();
    }

    /*
    Example of setting up 2D array, when the array is initialized
    */
    
    public static void writingTo2DArrayExample1() {
        int[][] numbers = new int[][]{
            {0, 1, 2},
            {3, 4, 5}
        };
    }
    
    /*
    Example of setting up array one block at the time
    */

    public static void writingTo2DArrayExample2() {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 0;
        numbers[0][1] = 1;
        numbers[0][2] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        numbers[1][2] = 5;
    }
    
    /* 
    Example of filling up 2D array with 2 for loops
    */

    public static int[][] writingTo2DArrayExample3() {
        int[][] numbers = new int[2][3];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i + j;
            }
        }
        return numbers;
    }
    
    /* 
    Example of reading values from array one block at the time
    */

    public static void readingFrom2DArrayExample1() {
        int[][] numbers = writingTo2DArrayExample3();
        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[0][2]);
        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);
        System.out.println(numbers[1][2]);
    }
    
    /* 
    Example of reading 2D array using two for loops
    */

    public static void readingFrom2DArrayExample2() {
        int[][] numbers = writingTo2DArrayExample3();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }
    
    /*
    Example of shuffling a 2D array by using a combination of for loop and 
    if statement. 
    
    The array will be provided by the writingTo2DArrayExample3 method that will
    return a 2D array.
    
    The original and shuffled array will then be compared by passing both arrays
    as parameters to comparingShuffledArrayToOriginalArray method
    */

    public static void randomShuffling() {
        
        int[][] numbers = writingTo2DArrayExample3();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int i1 = (int) (Math.random() * numbers.length);
                int j1 = (int) (Math.random() * numbers[i].length);
                int temp = numbers[i][j];
                numbers[i][j] = numbers[i1][j1];
                numbers[i1][j1] = temp;
            }
        }
        comparingShuffledArrayToOriginalArray(numbers,writingTo2DArrayExample3());
    }
    
        public static void comparingShuffledArrayToOriginalArray(int [][] shuffledArray,
                int [][] originalArray) {
        for (int i = 0; i < shuffledArray.length; i++) {
            for (int j = 0; j < shuffledArray[i].length; j++) {
                System.out.println("location " + i +"," + j + " of shuffled array " + shuffledArray[i][j]);
                System.out.println("location " + i +"," + j + " of original array " + originalArray[i][j]);
                System.out.println("");
            }
        }
    }
}
