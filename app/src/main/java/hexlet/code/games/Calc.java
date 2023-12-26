package hexlet.code.games;

import hexlet.code.Utils;

import java.util.Random;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Calc {
    /**
     * Start the game.
     *
     * @param username Username
     */
    public static void launch(String username) {
        System.out.println("What is the result of the expression?");
        String[] questions = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        String[] correctAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int a = Utils.generateRandomNum();
            int b = Utils.generateRandomNum();
            String operation = randomOperation();
            questions[i] = a + " " + operation + " " + b;
            correctAnswers[i] = calculate(a, b, operation);
        }
        startGame(username,
                questions,
                correctAnswers);
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

    private static String randomOperation() {
        String operations = "+-*";
        Random random = new Random();
        int size = operations.length();
        int randomIndex = random.nextInt(size);
        return String.valueOf(operations.charAt(randomIndex));
    }
}
