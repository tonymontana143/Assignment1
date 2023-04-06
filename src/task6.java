import java.util.Scanner;

public class task6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = power(a, n);
        System.out.println(result);
    }
    public static int power(int a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n-1);
    }
}