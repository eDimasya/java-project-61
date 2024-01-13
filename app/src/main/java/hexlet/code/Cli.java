package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static String userIntroduction() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        System.out.println("Hello, " + username + "!");
        return username;
    }
}
