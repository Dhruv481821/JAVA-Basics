// package functions;
import java.util.*;

public class findGreatestTwo {

    public static int GreatestofTwoNumber (int a, int b) {
        if(a > b) {
            return a;
        } else {
            return b;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Secoond number : ");
        int num2 = sc.nextInt();


        int result = GreatestofTwoNumber(num1, num2);
        System.out.println("Greatest of ones is : "+ result );
    }
}
