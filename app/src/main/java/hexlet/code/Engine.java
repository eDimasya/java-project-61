package hexlet.code;

import java.util.Random;

public class Engine {
    public static String chooseGame() {
        return Cli.answerOnQuestion("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
    }

    private void printCongratulation() {
        System.out.println("Congratulations, " + username + "!");
    }
    private void printIsCorrect() {
        System.out.println("Correct!");
    }
    private void printTryAgain() {
        System.out.println("Let's try again, " + username + "!");
    }
    private void printAnswerIsWrong(String userAnswer, String correctAnswer) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        printTryAgain();
    }
    public boolean isEndGame() {
        return endGame;
    }
    private boolean endGame = false;
    private int successCounter = 0;
    private final String username;
    public Engine(final String username) {
        this.username = username;
    }

    private void plusSuccess() {
        this.successCounter += 1;
    }
    public void checkAnswer(String userAnswer, String correctAnswer) {
        if (correctAnswer.equals(userAnswer)) {
            plusSuccess();
            printIsCorrect();
            if (successCounter == 3) {
                printCongratulation();
                endGame = true;
            }
        } else {
            printAnswerIsWrong(userAnswer, correctAnswer);
            endGame = true;
        }
    }
    public static int generateRandomNum() {
        int min = 0;
        int max = 100;
        return generateRandomNum(min, max);
    }
    public static int generateRandomNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
    public static String randomStringChar(String str) {
        Random random = new Random();
        int size = str.length();
        int randomIndex = random.nextInt(size);
        return String.valueOf(str.charAt(randomIndex));
    }
    public static String setUserAnswer() {
        return Cli.answerOnQuestion("Your answer: ");
    }
    public static void printQuestion(String question) {
        System.out.println("Question: " + question);
    }
}
