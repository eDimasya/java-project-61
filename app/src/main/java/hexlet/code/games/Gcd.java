package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Gcd {
    /**
     * Start the game.
     *
     * @param username Username
     */
    public static void launch(String username) {
        System.out.println("Find the greatest common divisor of given numbers.");
        String[] questions = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        String[] correctAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int a = Utils.generateRandomNum();
            int b = Utils.generateRandomNum();
            questions[i] = (a + " " + b);
            correctAnswers[i] = findGCD(a, b);
        }
        startGame(username,
                questions,
                correctAnswers);
    }

    //Неоптимальынй алгоритм, можно использовать алгоритм Эвклида
    private static String findGCD(int a, int b) {
        int gsd = 1;
        int i = 1;
        while (i <= a && i <= b) {
            if ((a % i == 0) && (b % i == 0)) {
                gsd = i;
            }
            i++;
        }
        return String.valueOf(gsd);
    }

}
