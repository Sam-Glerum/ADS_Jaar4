import java.sql.Time;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        int[] sortedArr = {2, 3, 8 ,16 ,23};

//        exercise_1_linearSearch(sortedArr, 3);
//        exercise_2_binarySearch(sortedArr, 3);
        exercise_3_measuretime();

    }

    public static void exercise_1_linearSearch(int[] arr, int searchValue) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == searchValue) {
                System.out.println("Value " + searchValue + " found at index " + i);
            }
        }
        System.out.println("Value not found in list");
    }

    public static void exercise_2_binarySearch(int[] arr, int searchValue) {
        int higherBound = arr.length - 1;
        int lowerBound = 0;
        int stepstaken = 1;
        String printString = "Value found at index ";

        while (lowerBound <= higherBound) {
            int mid = lowerBound + (higherBound - lowerBound) / 2;
            if (mid == searchValue) {
                System.out.println("Steps taken: " + stepstaken);
                System.out.println(printString);
                break;
            } else if (searchValue < mid) {
                stepstaken++;
                higherBound = mid - 1;
            } else if (searchValue > mid) {
                stepstaken++;
                lowerBound = mid + 1;
            }
        }
    }

    public static void exercise_3_measuretime() {
        int[] range = IntStream.rangeClosed(1, 1000000).toArray();

        long currentTime = System.nanoTime();
//        exercise_1_linearSearch(range, 300000);
        exercise_2_binarySearch(range, 300000);
        long newTime = System.nanoTime();

        System.out.println("Time elapsed: " + (newTime - currentTime));
    }


}
