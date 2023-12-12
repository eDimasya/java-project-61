package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.AMOUNT_OF_WINS_FOR_VICTORY;

public class Even {
    /**
     * @param username Username
     */
    public static void startGame(String username) {
        System.out.println(getInitQuestion());
        int round = 0;
        boolean gameInProgress = true;
        while (gameInProgress) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.takeAnswer();
            gameInProgress = Engine.checkAnswer(correctAnswer, userAnswer, username);
            round++;
            if (round == AMOUNT_OF_WINS_FOR_VICTORY && gameInProgress) {
                Utils.printCongratulation(username);
                gameInProgress = false;
            }
        }
    }

    public static String askQuestion() {
        int randomNum = Utils.generateRandomNum();
        Engine.askQuestion(String.valueOf(randomNum));
        if (Utils.isEven(randomNum)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static String getInitQuestion() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
