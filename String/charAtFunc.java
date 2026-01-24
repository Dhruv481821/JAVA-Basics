// package String;
import java.util.*;

public class charAtFunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String input = sc.nextLine();

        for(int i=0; i<input.length(); i++) {
            System.out.println(input.charAt(i));
        }
    }
    
} 
