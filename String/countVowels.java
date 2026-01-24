// package String;
import java.util.*;

public class countVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name to count vowels: ");
        String name = sc.nextLine();

        int vowelsCount = 0;
    
        for(int i=0; i<name.length(); i++) {
            char ch = Character.toLowerCase(name.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelsCount++;
            } else {
                continue;
            }

            System.out.println("Total Vowels in your name: " + vowelsCount);
        }
    }
}

