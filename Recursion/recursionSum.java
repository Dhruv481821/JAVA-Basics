// package Recursion;
import java.util.*;

public class recursionSum {

    public static void printSum(int i, int n, int sum) {

        if(i == n) {
            sum += i;
            System.out.println("Sum is: " + sum);
            return ;
        }

        sum += i;
        printSum(i+1, n, sum);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        printSum(1, n, 0);
    }
}
