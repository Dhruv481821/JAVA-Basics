package conditional;
import java.util.*;

public class LargestNumber {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter second Number :" );
        int n2 = sc.nextInt();

        if (n1 == n2) {
            System.out.println("Both numbers are equal");
        } else if (n1 < n2) {
            System.out.println("Largest number is :"+ n2);
        } else {
            System.out.println("Largest number is :"+ n1);
        }

    }
}
