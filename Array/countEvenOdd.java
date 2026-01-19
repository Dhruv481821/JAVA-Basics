// package Array;
import java.util.*;

public class countEvenOdd {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int evencount = 0;
        int oddcount = 0;

        for(int i=0; i<size; i++) {
            if(numbers[i]%2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }

        System.out.println("Count of even numbers: " + evencount);
        System.out.println("Count of odd numbers: " + oddcount);
    }
}
