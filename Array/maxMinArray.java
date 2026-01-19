// package Array;
import java.util.*;

public class maxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        //input matrix
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        int max = matrix[0][0];
        int min = matrix[0][0];

        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                if(matrix[i][j] > max) {
                    max = matrix[i][j];
                }

                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element in the matrix: " + max);
        System.out.println("Minimum element in the matrix: " + min);
    }
}
