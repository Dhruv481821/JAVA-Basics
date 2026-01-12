package conditional;
import java.util.*;

public class basicCalculator {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = sc.nextInt();

        System.out.println("Choose an operation (+, -, X, /):" );
        char operation = sc.next().charAt(0);

        if(operation == '+') {
            System.out.println("Result: " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Result: " + (num1 - num2));
        } else if (operation == 'X') {
            System.out.println("Result: "+ (num1 * num2));
        } else if(operation == '/') {
            if(num2 != 0) {
                System.out.println("Result : "+ (num1/num2)); 
            } else {
                System.out.println("Result : Cannot divide by zero");
            }
        } else {
            System.out.println("Something went wrong! please try again.");
        }
    }
}
