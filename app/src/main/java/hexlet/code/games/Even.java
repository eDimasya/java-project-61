package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private final Engine game;

    public Even(final String username) {
        game = new Engine(username);
    }

    public void startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (!game.isEndGame()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            game.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int randomNum = Engine.generateRandomNum();
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
