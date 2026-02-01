// package Recursion;
import java.util.*;

public class recursionFactorial {

    public static int calFactorial(int n) {
        // base condition
        if (n == 0 || n == 1) {
            return 1;
        }

        int nmNum = calFactorial(n-1);
        int fact = n*nmNum;
        return fact;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = calFactorial(num);
        System.out.println("factorial of " + num + "is: " + result);
    }
}
