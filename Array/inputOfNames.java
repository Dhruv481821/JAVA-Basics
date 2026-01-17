// package Array;
import java.util.*;

public class inputOfNames {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of an array: ");
        int size = sc.nextInt();

        sc.nextLine();

        System.out.println("Enter the names of Students: ");
        String names[] = new String[size];

        //input
        for(int i=0; i<size; i++) {
            names[i] = sc.nextLine();
        }

        //output
        System.out.println("The names of Students are: ");
        for(int i=0; i<names.length; i++) {
            System.out.println("names "+ (i+1) + " is : " + names[i]);
        }
    }
}
