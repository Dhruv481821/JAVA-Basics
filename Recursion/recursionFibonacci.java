// package Recursion;
import java.util.*;

public class recursionFibonacci {
    public static void PrintFib(int a, int b, int n) {
        if (n == 0) {
            return ;
        }

        int c = a+b;
        System.out.println(c);
        PrintFib(b, c, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        if( n <= 0) {
            return;
        }

        int a = 0, b = 1;
        if(n>=1) System.out.println(a);
        if(n>=2) System.out.println(b);

        PrintFib(a, b, n-2);

        sc.close();
    }
}
