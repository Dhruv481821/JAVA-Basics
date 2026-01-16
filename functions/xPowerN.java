package functions;
import java.util.*;

public class xPowerN {

    public static long xPowerN (int a, int b) {
        long result = 1;

        for(int i =1; i <= b; i++) {
            result = result*a;
        } 

        return result;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the number: ");
        int num2 = sc.nextInt();

        long ans = xPowerN(num1, num2);
        System.out.println(num1 + " power " + num2 + " = " + ans);
    }
}
