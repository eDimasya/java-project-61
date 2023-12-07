package hexlet.code;

import hexlet.code.games.Even;
import hexlet.code.games.GameMaster;

public class App {
    public static void main(String[] args) {
        String pickedOption = GameMaster.chooseGame();
        if (!pickedOption.equals("0")) {
            String username = Cli.userIntroduction();
            if (pickedOption.equals("2")) {
                Even evenGame = new Even(username);
                evenGame.startGame();
            }
        }
    }
}
