package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.POSITION_OF_ANSWER;
import static hexlet.code.Engine.POSITION_OF_QUESTION;
import static hexlet.code.Engine.startGame;

public class Prime {
    private static final String RULE = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            int num = Utils.generateRandomNum();
            questionsWithAnswers[round][POSITION_OF_QUESTION] = String.valueOf(num);
            questionsWithAnswers[round][POSITION_OF_ANSWER] = checkNumIsPrime(num) ? "yes" : "no";
        }
        startGame(RULE, questionsWithAnswers);
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
