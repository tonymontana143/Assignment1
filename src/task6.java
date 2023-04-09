import java.util.Scanner;

public class task6 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        int result = FindPower(a, n);
        System.out.println(result);
    }
    /*
            @a-number
            @n-power of number
            @result-number in power

     */
    public static int FindPower(int a, int n) {
        if (n == 0) {   //Base case: every number power of zero - equal to one
            return 1;
        }
        return a * FindPower(a, n-1); //Multiply number power times
    }
}