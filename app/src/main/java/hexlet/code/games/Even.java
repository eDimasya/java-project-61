package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.POSITION_OF_ANSWER;
import static hexlet.code.Engine.POSITION_OF_QUESTION;
import static hexlet.code.Engine.startGame;

public class Even {

    private static final String RULE = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            int randomNum = Utils.generateRandomNum();
            questionsWithAnswers[round][POSITION_OF_QUESTION] = String.valueOf(randomNum);
            questionsWithAnswers[round][POSITION_OF_ANSWER] = (randomNum % 2 == 0) ? "yes" : "no";
        }
        startGame(RULE, questionsWithAnswers);
    }
}
