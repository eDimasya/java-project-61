package hexlet.code;

public class Cli {
    public static String userIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        String username = Utils.answerOnQuestion("May I have your name?");
        System.out.println("Hello, " + username + "!");
        return username;
    }
}
