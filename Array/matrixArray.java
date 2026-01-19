import java.util.*;

public class matrixArray {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();

        System.out.print("Enter the columns: ");
        int cols = sc.nextInt();

        int matrix[][] = new int[rows][cols];

        //input
        System.out.println("Enter the elements of the matrix: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        //output

        System.out.println("The matrix is: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
