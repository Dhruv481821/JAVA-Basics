package loops;
import java.util.*;
public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbe of rows: ");
        int rows = sc.nextInt();

        //upper half
        for(int i =1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }

            int spaces = 2*(rows-i);
            for(int j=1; j<=spaces; j++){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //lower half
        for(int i = rows; i>= 1; i--) {
            for(int j =1; j<=i; j++) {
                System.out.print("*");
            }

            for(int j =1; j<=2*(rows-i); j++) {
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
