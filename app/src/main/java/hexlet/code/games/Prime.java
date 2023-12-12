package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.AMOUNT_OF_WINS_FOR_VICTORY;

public class Prime {
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
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }

    private static String askQuestion() {
        int num = Utils.generateRandomNum();
        Utils.printQuestion(String.valueOf(num));
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
