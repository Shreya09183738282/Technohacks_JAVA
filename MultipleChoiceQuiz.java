import java.util.Scanner;

public class MultipleChoiceQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the Multiple-Choice Quiz!");
        System.out.println("Let's get started...\n");

        // Question 1
        System.out.println("Question 1: What is the capital of France?");
        System.out.println("A) London");
        System.out.println("B) Berlin");
        System.out.println("C) Paris");
        System.out.print("Your answer (A/B/C): ");
        String answer1 = scanner.nextLine().trim().toUpperCase();
        if (answer1.equals("C")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is C) Paris.\n");
        }

        // Question 2
        System.out.println("Question 2: Which planet is known as the Red Planet?");
        System.out.println("A) Jupiter");
        System.out.println("B) Mars");
        System.out.println("C) Venus");
        System.out.print("Your answer (A/B/C): ");
        String answer2 = scanner.nextLine().trim().toUpperCase();
        if (answer2.equals("B")) {
            System.out.println("Correct!\n");
            score++;
        } else {
            System.out.println("Incorrect. The correct answer is B) Mars.\n");
        }


        // Display final score
        System.out.println("Quiz complete!");
        System.out.println("Your score: " + score + " out of 2"); // Adjust the total number of questions
        scanner.close();
    }
}
