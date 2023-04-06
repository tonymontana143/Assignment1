import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    switch (n){
        case 1:
            System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                    "write the function that returns minimum of them.");
            task1.main();
            break;
        case 2:
            System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                    "write the function that returns average of them.");
            task2.main();
            break;
        case 3:
            System.out.println("You are given a number “n”, write the function for checking\n" +
                    "whether “n” is prime.");
            task3.main();
            break;
        case 4:
            System.out.println("You are given a number “n”, write the program using recursion for\n" +
                    "finding “n!”");
            task4.main();
        case 5:
            System.out.println("You are given a number “n”, write the function for finding n-th\n" +
                    "elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).\n" +
                    "F0= 0, F1 = 1.");
            task5.main();
        case 6:
            System.out.println("You are given numbers “a” and “n”, write the function that\n" +
                    "returns “a^n\n" +
                    "”. ");
            task6.main();
        case 7:
            System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                    "write the program that returns given array in reverse order");
            task7.main();
        case 8:
            System.out.println("You are given a string “s”, write the function for checking\n" +
                    "whether “s” is all consists of digits.");
            task8.main();
        case 9:
            System.out.println("You are given numbers“n” and “k”,write the program that finds Cn k (binomial coefficient) using formulaCn k=Cn−1 k−1 +Cn−1 k where Cn 0=Cn n=1.");
            task9.main();
        case 10:
            System.out.println("You are given numbers“n” and “k”,write the program that finds Cn k (binomial coefficient) using formulaCn k=Cn−1 k−1 +Cn−1 k where Cn 0=Cn n=1.");
    }
    }
}