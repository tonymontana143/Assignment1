import java.util.Scanner;

public class task1 {

    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int min = findMinimum(arr, n);
        System.out.println(min);
    }
    public static int findMinimum(int[] arr, int n) {

        if (n == 1) {
            return arr[0];
        }

        int min = findMinimum(arr, n - 1);
        if (min < arr[n - 1]) {
            return min;
        } else {
            return arr[n - 1];
        }
    }

}

