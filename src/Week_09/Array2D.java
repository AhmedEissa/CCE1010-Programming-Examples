package Week_09;

public class Array2D {

    public static void main(String[] args) {

    }

    public static void writingTo2DArrayExample1() {
        int[][] numbers = new int[][]{
            {0, 1, 2},
            {3, 4, 5}
        };
    }

    public static void writingTo2DArrayExample2() {
        int[][] numbers = new int[2][3];
        numbers[0][0] = 0;
        numbers[0][1] = 1;
        numbers[0][2] = 2;
        numbers[1][0] = 3;
        numbers[1][1] = 4;
        numbers[1][2] = 5;

    }

    public static int[][] writingTo2DArrayExample3() {
        int[][] numbers = new int[2][3];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                numbers[i][j] = i + j;
            }
        }
        return numbers;
    }

    public static void readingFrom2DArrayExample1() {
        int[][] numbers = writingTo2DArrayExample3();
        System.out.println(numbers[0][0]);
        System.out.println(numbers[0][1]);
        System.out.println(numbers[0][2]);
        System.out.println(numbers[1][0]);
        System.out.println(numbers[1][1]);
        System.out.println(numbers[1][2]);
    }

    public static void readingFrom2DArrayExample2() {
        int[][] numbers = writingTo2DArrayExample3();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                System.out.println(numbers[i][j]);
            }
        }
    }

}
