import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static ArrayList<Questions
    > questions = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    static int lastScore = 0;

    public static void main(String[] args) {

        loadQuestions();

        while (true) {

            System.out.println("\n===== JAVA QUIZ APPLICATION =====");
            System.out.println("1. Start Quiz");
            System.out.println("2. View Last Result");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    startQuiz();
                    break;
                case 2:
                    showResult();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    public static void loadQuestions() {

        questions.add(new Questions
            (
                "Which language is used for Android development?",
                "Python",
                "Java",
                "C++",
                "HTML",
                'B'));

        questions.add(new Questions
            (
                "Which data structure uses FIFO?",
                "Stack",
                "Queue",
                "Tree",
                "Graph",
                'B'));

        questions.add(new Questions
            (
                "Which company developed Java?",
                "Microsoft",
                "Apple",
                "Sun Microsystems",
                "Google",
                'C'));
    }

    public static void startQuiz() {

        int score = 0;

        for (Questions
             q : questions) {

            q.displayQuestion();
            System.out.print("Enter your answer (A/B/C/D): ");
            char answer = sc.next().charAt(0);

            if (q.checkAnswer(answer)) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Wrong! Correct answer: " + q.getCorrectAnswer());
            }
        }

        lastScore = score;

        System.out.println("\nQuiz Finished!");
        System.out.println("Score: " + score + "/" + questions.size());
    }

    public static void showResult() {

        if (lastScore == 0) {
            System.out.println("No quiz attempted yet!");
            return;
        }

        double percentage = (lastScore * 100.0) / questions.size();

        System.out.println("\nLast Score: " + lastScore + "/" + questions.size());
        System.out.println("Percentage: " + percentage + "%");

        if (percentage >= 80)
            System.out.println("Grade: A");
        else if (percentage >= 60)
            System.out.println("Grade: B");
        else if (percentage >= 40)
            System.out.println("Grade: C");
        else
            System.out.println("Grade: D");
    }
}