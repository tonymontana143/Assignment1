import java.util.Scanner;


public class task4 {
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int result = FindFactorial(n);
        System.out.println(result);
    }
    /*
            @result-definition of factorial
            @n-inputted number
            @return-returning factorial
     */
    public static int FindFactorial(int n) {
        if (n == 0 || n == 1) {     //Base case: Factorial of 0 and 1 equal to one
            return 1;
        } else {
            return n * FindFactorial(n - 1);    //Decrease our number and multiply with each other
        }
    }
}