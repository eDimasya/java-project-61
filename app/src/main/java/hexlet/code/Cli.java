package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String answerOnQuestion(String question) {
        System.out.println(question);
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    public static String userIntroduction() {
        System.out.println("Welcome to the Brain Games!");
        String username = answerOnQuestion("May I have your name?");
        System.out.println("Hello, " + username + "!");
        return username;
    }
}
