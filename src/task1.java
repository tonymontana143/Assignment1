import java.util.Scanner;


public class task1 {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMinimumInArray(arr, n);
        System.out.println(min);
    }
    /*
        @min- definition of min
        @arr-array
        @return- returning minimum of array
     */
    public static int findMinimumInArray(int[] arr, int n) {

        if (n == 1) {
            return arr[0]; //Base case: array with one element
        }

        int min = findMinimumInArray(arr, n - 1); //move with "n-1" length
        if (min < arr[n - 1]) {  //compare minimum with last element and so on
            return min;
        } else {
            return arr[n - 1]; //return last element as minimum
        }
    }

}

