package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Prime {
    /**
     * Start the game.
     *
     * @param username Username
     */
    public static void launch(String username) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String[] questions = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        String[] correctAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int num = Utils.generateRandomNum();
            questions[i] = String.valueOf(num);
            correctAnswers[i] = setCorrectAnswer(num);
        }
        startGame(username,
                questions,
                correctAnswers);
    }

    private static String setCorrectAnswer(int num) {
        if (checkNumIsPrime(num)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static boolean checkNumIsPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
