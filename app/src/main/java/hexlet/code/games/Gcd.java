package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.POSITION_OF_ANSWER;
import static hexlet.code.Engine.POSITION_OF_QUESTION;
import static hexlet.code.Engine.startGame;

public class Gcd {
    private static final String RULE = "Find the greatest common divisor of given numbers.";

    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            int a = Utils.generateRandomNum();
            int b = Utils.generateRandomNum();
            questionsWithAnswers[round][POSITION_OF_QUESTION] = (a + " " + b);
            questionsWithAnswers[round][POSITION_OF_ANSWER] = String.valueOf(findGCD(a, b));
        }
        startGame(RULE, questionsWithAnswers);
    }

    private static int findGCD(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

}
