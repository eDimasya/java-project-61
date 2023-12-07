package hexlet.code.games;

import hexlet.code.Cli;

import java.util.Random;

public class Even {
    private final String username;
    private int successCounter = 0;

    public Even(String username) {
        this.username = username;
    }

    public void startGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (successCounter < 3) {
            successCount(printQuestion(), setUserAnswer());
        }
        GameMaster.printCongratulation(username);
    }

    private int generateNum() {
        Random random = new Random();
        return random.nextInt(101);
    }

    private String printQuestion() {
        int randomNum = generateNum();
        System.out.println("Question: " + randomNum);
        if (isEven(randomNum)) {
            return "yes";
        } else {
            return "no";
        }
    }
    private String setUserAnswer() {
        return Cli.answerOnQuestion("Your answer: ");
    }

    private boolean isEven(int num) {
        return (num % 2 == 0);
    }

    private void successCount(String correctAnswer, String answer) {
        if (answer.equals(correctAnswer)) {
            GameMaster.printIsCorrect();
            successCounter += 1;
        } else {
            System.out.println("'" + answer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
            GameMaster.printTryAgain(username);
            successCounter = 0;
        }
    }
}
