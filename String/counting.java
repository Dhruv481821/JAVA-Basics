import java.util.*;

public class counting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any digit, number space or letter: ");
        String input = sc.nextLine();

        int digit =0, letter = 0, spaces =0, special = 0;

        for(int i=0; i<input.length(); i++) {
            char ch = input.charAt(i);

            if(Character.isDigit(ch)) digit++ ;
            else if(Character.isLetter(ch)) letter++ ;
            else if(ch == ' ') spaces++ ;
            else special++ ;
        }

        System.out.println("Letters: " + letter);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + spaces);
        System.out.println("Special: " + special);

    }
}
