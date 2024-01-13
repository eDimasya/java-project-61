package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int AMOUNT_OF_WINS_FOR_VICTORY = 3;
    public static final int POSITION_OF_ANSWER = 1;
    public static final int POSITION_OF_QUESTION = 0;

    public static void startGame(String rule, String[][] questionsAndAnswers) {
        String username = Cli.userIntroduction();
        System.out.println(rule);
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            System.out.println("Question: " + questionsAndAnswers[round][POSITION_OF_QUESTION]);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            String userAnswer = scanner.next();
            if (questionsAndAnswers[round][POSITION_OF_ANSWER].equals(userAnswer)) {
                System.out.println("Correct!");
            } else {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + questionsAndAnswers[round][POSITION_OF_ANSWER] + "'\n"
                        + "Let's try again, " + username + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + username + "!");
    }
}
