package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private Engine engine;

    public Even(String username) {
        engine = new Engine(username);
    }

    public void startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (!engine.isEndGame()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            engine.checkAnswer(userAnswer, correctAnswer);
        }
    }
    private String askQuestion() {
        int randomNum = Engine.generateNum();
        Engine.printQuestion(String.valueOf(randomNum));
        if (isEven(randomNum)) {
            return "yes";
        } else {
            return "no";
        }
    }
    private boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
