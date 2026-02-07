// package TestPaper;
import java.util.*;

public class newExam {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("====================Test=====================\n");


        System.out.print("Please input your name:");
        String name = sc.nextLine();

        System.out.print("Please enter your roll number: ");
        int rollNumber = sc.nextInt();
        sc.nextLine();

        int score = 0;

        String[] questions = {
            "Java is platform independent? (yes/no): ",
            "Java supports multiple inheritance using classes? (yes/no): ",
            "JVM stands for Java Virtual Machine? (yes/no): ",
            "int can store decimal values? (yes/no): ",
            "Java was developed by James Gosling? (yes/no): "
        };

        String[] answer = {"yes", "no", "yes", "no", "yes"};

        //loop for iterating through the questions
        for(int i =0; i<questions.length; i++) {
            System.out.print("Q" + (i+1) + ": " + questions[i]);
            String userAns = sc.nextLine().trim().toLowerCase();

            if (userAns.equals(answer[i])) {
                score++;
            } else {
                score--;
            }
        }

        //no negative score
        if(score<0) {
            score =0;
        } else if(score>questions.length) {
            score = questions.length;
        }

        //result
        double percentage = (score /(double)questions.length)*100;
        System.out.println("\n====================Result=====================");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.printf("Percentage: %.2f%%\n", percentage);

        if(percentage >= 60) {
            System.out.print("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        sc.close();
    } 
}
