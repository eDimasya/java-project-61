package hexlet.code.games;

import hexlet.code.Cli;

public class GameMaster {
    public static String chooseGame() {
        return Cli.answerOnQuestion("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                0 - Exit""");
    }
    public static void printCongratulation(String username) {
        System.out.println("Congratulations, " + username + "!");
    }
    public static void printIsCorrect() {
        System.out.println("Correct!");
    }
    public static void printTryAgain(String username) {
        System.out.println("Let's try again, " + username + "!");
    }
}
