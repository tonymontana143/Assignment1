import java.util.Scanner;

public class task3 {

    public static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (isPrime(n, (int) Math.sqrt(n))){ System.out.println("Prime");}

            else{
            System.out.println("Composite");
        }
    }

    public static boolean isPrime(int n, int i) {
        if (i == 1) {
            return true;
        } else {
            if (n % i == 0) {
                return false;
            } else {
                return isPrime(n, i - 1);
            }
        }
    }
}
