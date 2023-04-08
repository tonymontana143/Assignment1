import java.util.Scanner;
/*
        @n-inputted number
        @return-returning fibonacci number
 */
public class task5 {

    public static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n <= 1) {       //Base case: if number lesser than one, return itself
            return n;
        } else {
            return fib(n-1) + fib(n-2);//Call function to find the sum of two previous numbers
        }
    }


}