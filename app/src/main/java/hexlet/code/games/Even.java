package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Even {
    /**
     * @param username Username
     */
    public static void launch(String username) {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String[] questions = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        String[] correctAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            int questionData = Utils.generateRandomNum();
            questions[i] = String.valueOf(questionData);
            correctAnswers[i] = setCorrectAnswer(questionData);
        }
        startGame(username,
                questions,
                correctAnswers);
    }

    private static String setCorrectAnswer(int questionData) {
        if (isEven(questionData)) {
            return "yes";
        } else {
            return "no";
        }
    }

    private static boolean isEven(int num) {
        return (num % 2 == 0);
    }
}
