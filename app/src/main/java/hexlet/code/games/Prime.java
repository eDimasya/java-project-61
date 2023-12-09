package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private final Engine game;

    public Prime(final String username) {
        game = new Engine(username);
    }

    /**
     * Start the game.
     */
    public void startGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (game.isGameInProgress()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            game.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int num = Engine.generateRandomNum();
        Engine.printQuestion(String.valueOf(num));
        if (checkNumIsPrime(num)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private boolean checkNumIsPrime(int num) {
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
