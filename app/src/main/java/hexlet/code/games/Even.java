package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Even {
    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int questionData = Utils.generateRandomNum();
            //Question
            questionsWithAnswers[i][0] = String.valueOf(questionData);
            //Correct Answer
            questionsWithAnswers[i][1] =
                    isEven(questionData) ? "yes" : "no";
        }
        startGame("Answer 'yes' if the number is even, otherwise answer 'no'.",
                questionsWithAnswers);
    }

    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
