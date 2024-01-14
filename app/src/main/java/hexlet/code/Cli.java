package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void userIntroduction() {
        System.out.println("Welcome to the Brain Games!\n"
                + "May I have your name?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, " + scanner.next() + "!");
    }
}
