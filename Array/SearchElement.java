// package Array;
import java.util.*;

public class SearchElement {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the elements of cols: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        
        System.out.print("Enter the element to be searched: ");
        int target = sc.nextInt();
        boolean found = false;

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(matrix[i][j] == target) {
                    System.out.println("Element found at index: "+ i + ", " + j);
                    found = true;
                } 
            }
        }
        if(!found) {
            System.out.println("Element not found in the array");
        }

        sc.close();
    }
}
