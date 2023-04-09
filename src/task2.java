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
        System.out.println(avg);
    }
    /*
    @avg- definition of average
    @arr-array
    @n-number of elements in an array
    @return-returning average number
*/
    public static double calculateAverage(int[] arr, int n) {
        if (n == 0) {       //Base case: if no elements, returns 0
            return 0;
        } else {
            return (arr[n-1] + (n-1)*calculateAverage(arr, n-1)) / n;   //Call to calculate sum of all elements, and divide by number of elements
        }
    }
}