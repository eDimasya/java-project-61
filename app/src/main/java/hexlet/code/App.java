package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Prime;
import hexlet.code.games.Progression;

public class App {
    public static void main(String[] args) {
        String pickedOption = Engine.chooseGame();
        if (!pickedOption.equals("0")) {
            String username = Cli.userIntroduction();
            switch (pickedOption) {
                case "2" -> {
                    Even evenGame = new Even(username);
                    evenGame.startGame();
                }
                case "3" -> {
                    Calc calcGame = new Calc(username);
                    calcGame.startGame();
                }
                case "4" -> {
                    GCD gcdGame = new GCD(username);
                    gcdGame.startGame();
                }
                case "5" -> {
                    Progression progressionGame = new Progression(username);
                    progressionGame.startGame();
                }
                case "6" -> {
                    Prime primeGame = new Prime(username);
                    primeGame.startGame();
                }
                default -> {
                }
            }
        }
    }
}
