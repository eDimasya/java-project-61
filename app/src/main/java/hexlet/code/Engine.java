package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int AMOUNT_OF_WINS_FOR_VICTORY = 3;

    public static void startGame(String rule, String[][] questionsAndAnswers) {
        String username = Cli.userIntroduction();
        System.out.println(rule);
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            System.out.println("Question: " + questionsAndAnswers[round][0]);
            String userAnswer = answerOnQuestion("Your answer: ");
            if (questionsAndAnswers[round][1].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[round][1] + "'"
                        + "\nLet's try again, " + username + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + username + "!");
    }

    public static String answerOnQuestion(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

}
