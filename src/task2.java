import java.util.Scanner;

public class task2 {
    public static void main() {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
        double avg = calculateAverage(arr, n);
        System.out.println(+ avg);
    }

    public static double calculateAverage(int[] arr, int n) {
        if (n == 0) {
            return 0;
        } else {
            return (arr[n-1] + (n-1)*calculateAverage(arr, n-1)) / n;
        }
    }
}