// package String;
import java.util.Scanner;

public class inputString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your full name: ");
        String Fullname = sc.nextLine();

        System.out.println(Fullname.charAt(0));
        System.out.println(Fullname.charAt(1));
    }
}
