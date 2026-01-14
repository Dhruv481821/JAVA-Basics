package functions;
import java.util.*;

public class calculateMul {

    public static float calmul(float a, float b) {
        float mul = a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First number: ");
        float mul1 = sc.nextFloat();

        System.out.print("Enter second number : ");
        float mul2 = sc.nextFloat();

        float Answer = calmul(mul1, mul2);
        System.out.println("Multiplication of two is : "+ Answer);
    }
}
