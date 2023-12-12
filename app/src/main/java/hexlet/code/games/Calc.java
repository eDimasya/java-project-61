package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.AMOUNT_OF_WINS_FOR_VICTORY;

public class Calc {
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

    /**
     * Get game introduction.
     *
     * @return Game introduction
     */
    private static String getInitQuestion() {
        return "What is the result of the expression?";
    }

    private static String askQuestion() {
        int a = Utils.generateRandomNum();
        int b = Utils.generateRandomNum();
        String operation = Utils.randomOperation();
        Utils.printQuestion(a + " " + operation + " " + b);
        return calculate(a, b, operation);
    }

    private static String calculate(int a, int b, String operation) {
        int result = 0;
        switch (operation) {
            case "+" -> {
                result = a + b;
            }
            case "-" -> {
                result = a - b;
            }
            case "*" -> {
                result = a * b;
            }
            default -> {
            }
        }
        return String.valueOf(result);
    }
}
