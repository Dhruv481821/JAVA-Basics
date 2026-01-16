// package functions;
import java.util.*;

public class circumferenceOfCircle {

    public static double circleCercumference (double radius) {
        double pi = 3.14;

        return 2*pi*radius;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Radius: ");
        int radius = sc.nextInt();

        double result = circleCercumference(radius);
        System.out.println(result);
    }
}