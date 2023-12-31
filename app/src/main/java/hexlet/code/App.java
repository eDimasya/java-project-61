package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(final String[] args) {
        String pickedOption = Engine.answerOnQuestion("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");
        switch (pickedOption) {
            case "1" -> Cli.userIntroduction();
            case "2" -> Even.launch(Cli.userIntroduction());
            case "3" -> Calc.launch(Cli.userIntroduction());
            case "4" -> Gcd.launch(Cli.userIntroduction());
            case "5" -> Progression.launch(Cli.userIntroduction());
            case "6" -> Prime.launch(Cli.userIntroduction());
            default -> {
            }
        }
    }
}
