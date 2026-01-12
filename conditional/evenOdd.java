package conditional;
import java.util.Scanner;

public class evenOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("It's an Even number: " + num);
        } else {
            System.out.println("It's an Odd number: " + num);
        }

        sc.close();
    }
}
