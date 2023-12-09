package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
    private final Engine game;

    public GCD(final String username) {
        game = new Engine(username);
    }

    public void startGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
        while (!game.isEndGame()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            game.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int a = Engine.generateRandomNum();
        int b = Engine.generateRandomNum();
        Engine.printQuestion(a + " " + b);
        return findGCD(a, b);
    }

    //Неоптимальынй алгоритм, можно использовать алгоритм Эвклида
    private String findGCD(int a, int b) {
        int gsd = 1;
        int i = 1;
        while (i <= a && i <= b) {
            if ((a % i == 0) && (b % i == 0)) {
                gsd = i;
            }
            i++;
        }
        return String.valueOf(gsd);
    }

}
