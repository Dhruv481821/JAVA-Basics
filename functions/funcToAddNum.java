// package functions;
import java.util.*;

public class funcToAddNum {

    public static int sumOfTwoNum(int a, int b) {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number : ");
        int num2 = sc.nextInt();

        int result = sumOfTwoNum(num1, num2);
        System.out.println("sum of two number is "+result);
        sc.close();
    }
}
