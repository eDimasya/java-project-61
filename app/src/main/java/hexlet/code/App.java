package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

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
                default -> {
                }
            }
        }
    }
}
