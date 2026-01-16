package functions;
import java.util.*;

public class avgFun {

    public static int funAvg (int a, int b, int c) {
        int average = (a+b+c)/3;
        return average;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number 1: ");
        int num01 = sc.nextInt();
        
        System.out.print("Enter the number 2: ");
        int num02 = sc.nextInt();

        System.out.print("Enter the number 3: ");
        int num03 = sc.nextInt();

        int averageFunc = funAvg(num01, num02, num03);
        System.out.println("Average of 3 numbers : "+averageFunc);
    }
}