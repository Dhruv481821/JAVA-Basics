package Array;
import java.util.*;

public class searchNumberX {
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

        System.out.println("Enter the number to be searched: ");
        int x = sc.nextInt();

        //output
        for(int i=0; i<numbers.length; i++) {
            if(numbers[i] == x) {
                System.out.print("Number found at index: "+ i);
                return;
            }
        }
    }
    
}
