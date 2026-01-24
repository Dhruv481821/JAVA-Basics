import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string to check it's a palindrme or not: ");
        String str1 = sc.nextLine();

        String reversed = "";

        for(int i=str1.length()-1; i>=0; i--) {
            reversed += str1.charAt(i);
        }

        if(str1.equalsIgnoreCase(reversed)) {
            System.out.println(str1 + " is a Palindrome");
        } else {
            System.out.println(str1 + " is not a Palindrome");
        }
    }
}
