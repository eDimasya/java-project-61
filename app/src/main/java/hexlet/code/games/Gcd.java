package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Gcd {
    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int a = Utils.generateRandomNum();
            int b = Utils.generateRandomNum();
            questionsWithAnswers[i][0] = (a + " " + b);
            questionsWithAnswers[i][1] = String.valueOf(findGCD(a, b));
        }
        startGame("Find the greatest common divisor of given numbers.",
                questionsWithAnswers);
    }

    //Неоптимальынй алгоритм, можно использовать алгоритм Эвклида
    private static int findGCD(int a, int b) {
        int gsd = 1;
        int i = 1;
        while (i <= a && i <= b) {
            if ((a % i == 0) && (b % i == 0)) {
                gsd = i;
            }
            i++;
        }
        return gsd;
    }

}
