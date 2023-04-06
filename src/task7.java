import java.util.Scanner;

public class task7 {
    public static void reverse(int[] arr, int first, int last) {
        if (first >= last) {
            return;}
        int temp = arr[first];
        arr[first] = arr[last];
        arr[last] = temp;

        reverse(arr, first + 1, last - 1);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        reverse(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}