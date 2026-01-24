// package String;
import java.util.*; 

public class reverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i=0; i<str.length()/2; i++) {

            int frontIndex = i;
            int backIndex = str.length()-1-i;

            char frontChar = str.charAt(frontIndex);
            char backChar = str.charAt(backIndex);

            str.setCharAt(frontIndex, backChar);
            str.setCharAt(backIndex, frontChar);
        }

        System.out.println("Reversed String: " + str);
    }
}
