// package String;
import java.util.*; 

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        String reversedStr = "";
        for(int i =str.length() - 1; i>=0l; i--) {
            reversedStr += str.charAt(i);
        }
        System.out.println("Reversed String: " + reversedStr);
    }
}
