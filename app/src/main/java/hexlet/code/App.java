package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(final String[] args) {
        start();
    }

    public static final int GREET = 1;
    public static final int EVEN = 2;
    public static final int CALC = 3;
    public static final int GCD = 4;
    public static final int PROGRESSION = 5;
    public static final int PRIME = 6;

    private static void start() {
        int pickedOption = chooseGameDialog();
        if (pickedOption >= GREET && pickedOption <= PRIME) {
            final String username = Cli.userIntroduction();
            launchGame(pickedOption, username);
        }
    }

    /**
     * Game pick menu.
     *
     * @return Picked option in int
     */
    public static int chooseGameDialog() {
        return Integer.parseInt(Utils.answerOnQuestion("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit"""));
    }

    /**
     * Game launcher.
     *
     * @param userChoose Picked game
     * @param username   Username
     */
    public static void launchGame(int userChoose, String username) {
        switch (userChoose) {
            case EVEN -> Even.startGame(username);
            case CALC -> Calc.startGame(username);
            case GCD -> Gcd.startGame(username);
            case PROGRESSION -> Progression.startGame(username);
            case PRIME -> Prime.startGame(username);
            default -> {
            }
        }
    }
}
