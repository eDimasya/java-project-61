package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Prime {
    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int num = Utils.generateRandomNum();
            questionsWithAnswers[i][0] = String.valueOf(num);
            questionsWithAnswers[i][1] = checkNumIsPrime(num) ? "yes" : "no";
        }
        startGame("Answer 'yes' if given number is prime. Otherwise answer 'no'.",
                questionsWithAnswers);
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
