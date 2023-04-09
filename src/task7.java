import java.util.Scanner;

public class task7 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();      //input array
        }
        WriteReverseOfArray(arr, 0, n - 1);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");     //print reversed array
        }
    }
    /*
            @arr-array
            @n-number of elements
            @arr[first]-first element of array
            @arr[last]-last element of array
     */
    public static void WriteReverseOfArray(int[] arr, int first, int last) {
        if (first >= last) {        //Base case
            return;
        }
        int temp = arr[first];      //Swap first and last element
        arr[first] = arr[last];
        arr[last] = temp;

        WriteReverseOfArray(arr, first + 1, last - 1);      //Call function and swap our elements from beginning to end
    }

}