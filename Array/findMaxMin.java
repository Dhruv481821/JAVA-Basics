// package Array;
import java.util.*;

public class findMaxMin {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        System.out.println("Enter the elements of an array: ");
        int numbers[] = new int[size];
        
        //input

        for(int i=0; i<size; i++) {
            numbers[i] = sc.nextInt();
        }

        int max = numbers[0];
        int min = numbers[0];

        for(int i=1; i<size; i++) {
            if(numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum value of a array is : "+ max);
        System.out.println("Minimum value of a array is : "+ min);

        sc.close();
    }
}
