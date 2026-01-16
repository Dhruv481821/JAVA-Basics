package functions;
import java.util.*;

public class SumOfOddNumbers {

    public static int oddNumbers(int oddNumbers) {
        int sum = 0;
        for(int i = 1; i<= oddNumbers; i++) {
            if(i%2 != 0) {
                sum = sum+i;
            }
        }
        return sum;
    }
    public static void main(String[] args) {
         Scanner sc=  new Scanner(System.in);

        System.out.print("Enter the number to add all odd numbers: ");
        int oddAddition = sc.nextInt();

        int result = oddNumbers(oddAddition);
        System.out.println("The sum of all odd numbers: " + result);
    }
}