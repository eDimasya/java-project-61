package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
    private Engine engine;
    public Calc(String username) {
        engine = new Engine(username);
    }
    public void startGame() {
        System.out.println("What is the result of the expression?");
        while (!engine.isEndGame()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            engine.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int a = Engine.generateNum();
        int b = Engine.generateNum();
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
            default -> { }
        }
        return String.valueOf(result);
    }
}
