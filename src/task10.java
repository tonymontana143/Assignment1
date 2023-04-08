import java.util.Scanner;
/*
        @a,b-inputted numbers
        @res-GCD of numbers
        @return- returning result
 */
public class task10 {
    public static void main() {
        Scanner scanner=new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();      //input numbers
        int res=findGCD(a,b);
        System.out.println(res);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {   //Base case, if b equal to 0
            return a;
        } else {
            return findGCD(b, a % b);  //Call function with a%b(remainder) and second element, and return result
        }
    }
}