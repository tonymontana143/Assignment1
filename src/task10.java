import java.util.Scanner;
public class task10 {
    public static void main() {
        Scanner scanner=new Scanner(System.in);
        int b = scanner.nextInt();
        int a = scanner.nextInt();
        int res=findGCD(a,b);
        System.out.println(res);
    }

    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return findGCD(b, a % b);
        }
    }
}