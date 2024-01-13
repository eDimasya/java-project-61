package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.POSITION_OF_ANSWER;
import static hexlet.code.Engine.POSITION_OF_QUESTION;
import static hexlet.code.Engine.startGame;

public class Calc {
    private static final String RULE = "What is the result of the expression?";

    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            int a = Utils.generateRandomNum();
            int b = Utils.generateRandomNum();
            String[] operations = {"+", "-", "*"};
            String operation = operations[Utils.generateRandomNum(0, operations.length - 1)];
            questionsWithAnswers[round][POSITION_OF_QUESTION] = a + " " + operation + " " + b;
            questionsWithAnswers[round][POSITION_OF_ANSWER] = String.valueOf(calculate(a, b, operation));
        }
        startGame(RULE, questionsWithAnswers);
    }

    private static int calculate(int a, int b, String operation) {
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
        return result;
    }
}
