package conditional;
import java.util.*;

public class CharacterType {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any character to check if it's a digit or a letter : ");
        char ch = sc.next().charAt(0);    

        if (ch >='a' && ch <= 'z') {
            System.out.println("Ther character you typed is a Lowercase letter: "+ ch);
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Ther character you typed is an uppercase latter: "+ ch);
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("The character you typed is a Digit: "+ ch);
        } else {
            System.out.println("The character you typed is a special character: "+ ch);
        }
    }
}
