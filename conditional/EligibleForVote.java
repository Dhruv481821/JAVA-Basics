package conditional;
import java.util.*;

public class EligibleForVote {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if(age >= 18) {
            System.out.println("Eligible for vote :" +age);
        } else {
            System.out.println("Not eligible for vote : " +age);
        }
    }
}
