import java.util.Scanner;

public class task9 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(binomialCoef(n,k));
    }

    public static int binomialCoef(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else {
            return binomialCoef(n - 1, k - 1) + binomialCoef(n - 1, k);
        }
    }
}