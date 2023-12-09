package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private final Engine game;

    /**
     * @param username Username
     */
    public Calc(final String username) {
        game = new Engine(username);
    }

    /**
     * Start the game.
     */
    public void startGame() {
        System.out.println("What is the result of the expression?");
        while (game.isGameInProgress()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            game.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int a = Engine.generateRandomNum();
        int b = Engine.generateRandomNum();
        String operation = randomOperation();
        Engine.printQuestion(a + " " + operation + " " + b);
        return calculate(a, b, operation);
    }

    private String randomOperation() {
        String operations = "+-*";
        return Engine.randomStringChar(operations);
    }

    private String calculate(int a, int b, String operation) {
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
