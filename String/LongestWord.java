import java.util.*;

public class LongestWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();

        String[] words = s.split("\\s+");
        String longest = "";

        for(String w : words){
            if(w.length() > longest.length()){
                longest = w;
            }
        }

        System.out.println("Longest word: " + longest);
    }
}
