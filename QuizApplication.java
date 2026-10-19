
import java.util.Scanner;
public class QuizApplication {

    static String[] questions = {
        "Which data structure uses FIFO?",
        "Which keyword creates an object in Java?",
        "What is the time complexity of binary search?",
        "Which collection stores unique elements?",
        "Which language runs on the JVM?"
    };

    static String[][] options = {
        {"A. Stack", "B. Queue", "C. Tree", "D. Graph"},
        {"A. class", "B. void", "C. new", "D. static"},
        {"A. O(n)", "B. O(n^2)", "C. O(log n)", "D. O(1)"},
        {"A. List", "B. Set", "C. Array", "D. Queue"},
        {"A. Java", "B. C", "C. HTML", "D. SQL"}
    };

    static char[] answers = {'B', 'C', 'C', 'B', 'A'};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = 0;

        System.out.println("=== JAVA QUIZ ===");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("\nQ" + (i + 1) + ". " + questions[i]);

            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            String input = sc.next().trim().toUpperCase();

            if (input.length() == 1 &&
                input.charAt(0) == answers[i]) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. Answer: " + answers[i]);
            }
        }

        double percentage = score * 100.0 / questions.length;

        System.out.println("\n=== QUIZ RESULT ===");
        System.out.println("Score: " + score + "/" + questions.length);
        System.out.printf("Percentage: %.2f%%%n", percentage);

        if (percentage >= 80) {
            System.out.println("Excellent performance!");
        } else if (percentage >= 50) {
            System.out.println("Good effort!");
        } else {
            System.out.println("Keep practising!");
        }

        sc.close();
    }
}
