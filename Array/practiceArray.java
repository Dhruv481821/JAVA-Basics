package Array;
import java.util.*;

public class practiceArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        System.out.println("Enter the elements of the Array: ");

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        //output
        System.out.println("The elements of the Array are: ");

        for(int i=0; i<size; i++) {
            System.out.println(numbers[i]);
        }
    }
} 
