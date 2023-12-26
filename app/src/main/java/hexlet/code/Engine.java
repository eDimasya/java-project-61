package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static final int AMOUNT_OF_WINS_FOR_VICTORY = 3;

    public static void startGame(String username, String[] questions, String[] correctAnswers) {
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            System.out.println("Question: " + questions[round]);
            if (!checkAnswer(correctAnswers[round], setUserAnswer(), username)) {
                return;
            }
        }
        System.out.println("Congratulations, " + username + "!");
    }

    /**
     * Answers checker.
     *
     * @param userAnswer    User Answer
     * @param correctAnswer Correct Answer
     * @param username      Username
     * @return result of checking answer
     */
    public static boolean checkAnswer(String correctAnswer, String userAnswer, String username) {
        if (correctAnswer.equals(userAnswer)) {
            System.out.println("Correct!");
            return true;
        } else {
            System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
            System.out.println("Let's try again, " + username + "!");
            return false;
        }
    }

    public static String answerOnQuestion(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }

    public static String setUserAnswer() {
        return answerOnQuestion("Your answer: ");
    }

}
