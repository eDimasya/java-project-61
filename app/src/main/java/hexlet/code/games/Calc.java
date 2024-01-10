package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Random;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Calc {
    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int a = Utils.generateRandomNum();
            int b = Utils.generateRandomNum();
            String operation = randomOperation();
            //Question
            questionsWithAnswers[i][0] = a + " " + operation + " " + b;
            //Correct Answer
            questionsWithAnswers[i][1] = String.valueOf(calculate(a, b, operation));
        }
        startGame("What is the result of the expression?",
                questionsWithAnswers);
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

    private static String randomOperation() {
        String operations = "+-*";
        Random random = new Random();
        int size = operations.length();
        int randomIndex = random.nextInt(size);
        return String.valueOf(operations.charAt(randomIndex));
    }
}
