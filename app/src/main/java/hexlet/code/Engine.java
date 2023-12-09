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

    /**
     * @return End game property. If false - then game over
     */
    public boolean isGameInProgress() {
        return gameInProgress;
    }
    private boolean gameInProgress = true;
    private int winCount = 0;
    private final String username;
    public Engine(final String name) {
        this.username = name;
    }

    /**
     * Answers checker.
     * @param userAnswer User Answer
     * @param correctAnswer Correct Answer
     */
    public void checkAnswer(String userAnswer, String correctAnswer) {
        final int winsForEndGame = 3;
        if (correctAnswer.equals(userAnswer)) {
            winCount++;
            printIsCorrect();
            if (winCount == winsForEndGame) {
                printCongratulation();
                gameInProgress = false;
            }
        } else {
            printAnswerIsWrong(userAnswer, correctAnswer);
            gameInProgress = false;
        }
    }
    public static int generateRandomNum() {
        final int min = 1;
        final int max = 100;
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
