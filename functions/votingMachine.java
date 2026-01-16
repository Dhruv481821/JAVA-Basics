// package functions;
import java.util.*;

public class votingMachine {

    public static void votingMachine(int age) {
        if(age >= 18) {
            System.out.print("You can vote");
        } else {
            System.out.println("You can't vote: ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter you age: ");
        int age = sc.nextInt();

        votingMachine(age);
    }
}
