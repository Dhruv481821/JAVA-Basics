// package Array;
import java.util.*;

public class reverseArray {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        int numbers[] = new int[size];

        //input
        System.out.println("Enter the elements of an array: ");
        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.println("reversed array is: ");
        for(int i=size-1; i>=0; i--) {
            System.out.println(numbers[i] + " ");
        }
        sc.close();
    }
}
