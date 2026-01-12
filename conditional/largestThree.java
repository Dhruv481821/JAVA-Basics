package conditional;
import java.util.*;

public class largestThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter First Number : ");
        int n1 = sc.nextInt();

        System.out.println("Enter Second number : ");
        int n2 = sc.nextInt();

        System.out.println("Enter Third number : ");
        int n3 = sc.nextInt();

        if(n1 == n2 && n2 == n3) {
            System.out.println("All three numbers are equal : ");
        } else if(n1 >= n2 && n1 >= n3) {
            System.out.println("Largest number id: "+ n1);
        } else if(n2 >= n1 && n2 >= n3) {
            System.out.println("Largest number is : "+ n2);
        } else {
            System.out.println("Largest number is : "+ n3);
        }
    }
}
