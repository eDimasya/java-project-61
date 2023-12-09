package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private Engine engine;

    public Prime(String username) {
        engine = new Engine(username);
    }

    public void startGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (!engine.isEndGame()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            engine.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int num = Engine.generateRandomNum(0, 100);
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
