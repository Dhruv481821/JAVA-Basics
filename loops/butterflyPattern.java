package loops;
import java.util.*;
public class butterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of row: ");
        int rows = sc.nextInt();

        //upper half
        for(int i =1; i<=rows; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
        }
    }
}
