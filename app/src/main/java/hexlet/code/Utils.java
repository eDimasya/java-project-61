package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Utils {
    public static void printCongratulation(String username) {
        System.out.println("Congratulations, " + username + "!");
    }

    public static void printIsCorrect() {
        System.out.println("Correct!");
    }

    public static void printTryAgain(String username) {
        System.out.println("Let's try again, " + username + "!");
    }

    public static void printAnswerIsWrong(String userAnswer, String correctAnswer, String username) {
        System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '" + correctAnswer + "'");
        printTryAgain(username);
    }

    public static String answerOnQuestion(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
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
        return Utils.answerOnQuestion("Your answer: ");
    }

    public static void printQuestion(String question) {
        System.out.println("Question: " + question);
    }

    public static boolean isEven(int num) {
        return (num % 2 == 0);
    }

    public static final int AMOUNT_OF_WINS_FOR_VICTORY = 3;

    public static String randomOperation() {
        String operations = "+-*";
        return randomStringChar(operations);
    }
}
