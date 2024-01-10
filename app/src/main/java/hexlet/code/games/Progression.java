package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.startGame;

public class Progression {
    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int i = 0; i < AMOUNT_OF_WINS_FOR_VICTORY; i++) {
            final int minNumBegin = 0;
            final int maxNumBegin = 100;
            final int minAmount = 5;
            final int maxAmount = 10;
            final int minGap = -10;
            final int maxGap = 10;
            String[] progression = createProgression(minNumBegin, maxNumBegin, minAmount, maxAmount, minGap, maxGap);
            int absentNumberPosition = Utils.generateRandomNum(0, progression.length - 1);
            //Correct Answer
            questionsWithAnswers[i][1] = progression[absentNumberPosition];
            progression[absentNumberPosition] = "..";
            //Question
            questionsWithAnswers[i][0] = String.join(" ", progression);
        }
        startGame("What number is missing in the progression?",
                questionsWithAnswers);
    }

    /**
     * @param minNumBegin minimal initial value
     * @param maxNumBegin maximum initial value
     * @param minAmount   minimal amount of values
     * @param maxAmount   maximum amount of values
     * @param minGap      minimum gap between values
     * @param maxGap      maximum gap between values
     * @return sequence of num in progression
     */
    private static String[] createProgression(int minNumBegin,
                                              int maxNumBegin,
                                              int minAmount,
                                              int maxAmount,
                                              int minGap,
                                              int maxGap) {
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
