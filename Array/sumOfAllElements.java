// package Array;
import java.util.*;

public class sumOfAllElements {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of a array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of a array: ");
        int numbers[] = new int[size];


        //input
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0; i<size; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of all elements in an array is : "+ sum);
    }
}
