package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.AMOUNT_OF_WINS_FOR_VICTORY;

public class Gcd {
    /**
     * Start the game.
     *
     * @param username Username
     */
    public static void startGame(String username) {
        System.out.println(getInitQuestion());
        int round = 0;
        boolean gameInProgress = true;
        while (gameInProgress) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.takeAnswer();
            gameInProgress = Engine.checkAnswer(correctAnswer, userAnswer, username);
            round++;
            if (round == AMOUNT_OF_WINS_FOR_VICTORY && gameInProgress) {
                Utils.printCongratulation(username);
                gameInProgress = false;
            }
        }
    }

    private static String getInitQuestion() {
        return "Find the greatest common divisor of given numbers.";
    }

    private static String askQuestion() {
        int a = Utils.generateRandomNum();
        int b = Utils.generateRandomNum();
        Utils.printQuestion(a + " " + b);
        return findGCD(a, b);
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
