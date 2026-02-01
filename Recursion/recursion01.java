// package Recursion;
import java.util.*;

public class recursion01 {

    public static void printN(int num, int n) {

        //base condition
        if(num > n) {
            return;
        }

        //print statement
        System.out.println(num);

        //recursive call
        printN(num+1, n);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        printN(1, n);
    }
}
