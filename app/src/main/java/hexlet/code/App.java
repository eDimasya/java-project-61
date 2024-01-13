package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

import java.util.Scanner;

public class App {
    public static void main(final String[] args) {
        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        Scanner scanner = new Scanner(System.in);
        String pickedOption = scanner.next();
        switch (pickedOption) {
            case "1" -> Cli.userIntroduction();
            case "2" -> Even.launch();
            case "3" -> Calc.launch();
            case "4" -> Gcd.launch();
            case "5" -> Progression.launch();
            case "6" -> Prime.launch();
            default -> {
            }
        }
    }
}
