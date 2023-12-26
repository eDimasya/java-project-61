package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Progression {
    /**
     * Start the game.
     *
     * @param username Username
     */
    public static void launch(String username) {
        System.out.println("What number is missing in the progression?");
        String[] questions = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        String[] correctAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            String[] progression = createProgression();
            int absentNumberPosition =
                    Utils.generateRandomNum(0, progression.length - 1);
            correctAnswers[i] = progression[absentNumberPosition];
            progression[absentNumberPosition] = "..";
            questions[i] = String.join(" ", progression);
        }
        startGame(username,
                questions,
                correctAnswers);
    }

    /**
     * @return sequence of num in progression
     */
    private static String[] createProgression() {
        final int minNumBegin = 0;
        final int maxNumBegin = 100;
        final int minAmount = 5;
        final int maxAmount = 10;
        final int minGap = -10;
        final int maxGap = 10;
        int begin = Utils.generateRandomNum(minNumBegin, maxNumBegin);
        int amount = Utils.generateRandomNum(minAmount, maxAmount);
        int gap = Utils.generateRandomNum(minGap, maxGap);
        int[] progression = new int[amount];
        String[] strProgression = new String[amount];
        progression[0] = begin;
        strProgression[0] = String.valueOf(progression[0]);
        for (int i = 1; i < amount; i++) {
            progression[i] = progression[i - 1] + gap;
            strProgression[i] = String.valueOf(progression[i]);
        }
        return strProgression;
    }
}
