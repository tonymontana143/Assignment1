import java.util.Scanner;

public class task9 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(findBinomialCoefficent(n,k));
    }
    /*
        @n,k-inputted numbers
        @return- returning binomial coefficient
     */
    public static int findBinomialCoefficent(int n, int k) {
        if (k == 0 || k == n) {     //Base case: if k is 0 or equal n, return 1
            return 1;
        } else {
            return findBinomialCoefficent(n - 1, k - 1) + findBinomialCoefficent(n - 1, k);     //Recursively call method with n-1  and k-1, and n-1 and k, and sum results
        }
    }
}