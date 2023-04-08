import java.util.Scanner;
/*
        @n-inputted number
        @return-returning False or True, since we have boolean
        @i-square root of number
 */
public class task3 {

    public static void main() {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        if (isPrime(n, (int) Math.sqrt(n)))//check our number by function
        {
            System.out.println("Prime");
        }

            else{
            System.out.println("Composite");//Otherwise, our number is composite
        }
    }

    public static boolean isPrime(int n, int i) {
        if (i == 1) {
            return true;    //Base case: if sqrt of our number equal to one
        } else {
            if (n % i == 0) {   //Divide our number by sqrt of number
                return false;
            } else {
                return isPrime(n, i - 1);   //Call function, and decrease divider by minus one
            }
        }
    }
}
