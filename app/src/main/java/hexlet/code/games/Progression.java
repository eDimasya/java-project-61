package hexlet.code.games;

import hexlet.code.Utils;

import static hexlet.code.Engine.AMOUNT_OF_WINS_FOR_VICTORY;
import static hexlet.code.Engine.POSITION_OF_ANSWER;
import static hexlet.code.Engine.POSITION_OF_QUESTION;
import static hexlet.code.Engine.startGame;

public class Progression {
    private static final String RULE = "What number is missing in the progression?";

    /**
     * Start the game.
     */
    public static void launch() {
        String[][] questionsWithAnswers = new String[AMOUNT_OF_WINS_FOR_VICTORY][2];
        for (int round = 0; round < AMOUNT_OF_WINS_FOR_VICTORY; round++) {
            final int minNumBegin = 0;
            final int maxNumBegin = 100;
            final int begin = Utils.generateRandomNum(minNumBegin, maxNumBegin);
            final int minAmount = 5;
            final int maxAmount = 10;
            final int amount = Utils.generateRandomNum(minAmount, maxAmount);
            final int minGap = -10;
            final int maxGap = 10;
            final int gap = Utils.generateRandomNum(minGap, maxGap);
            String[] progression = createProgression(begin, amount, gap);
            int absentNumberPosition = Utils.generateRandomNum(0, progression.length - 1);
            questionsWithAnswers[round][POSITION_OF_ANSWER] = progression[absentNumberPosition];
            progression[absentNumberPosition] = "..";
            questionsWithAnswers[round][POSITION_OF_QUESTION] = String.join(" ", progression);
        }
        startGame(RULE, questionsWithAnswers);
    }

    /**
     * @param begin         initial value
     * @param amount        amount of values
     * @param gap           gap between values
     * @return sequence of num in progression
     */
    private static String[] createProgression(int begin, int amount, int gap) {
        String[] progression = new String[amount];
        for (int i = 0; i < amount; i++) {
            progression[i] = String.valueOf(begin + gap * i);
        }
        return progression;
    }
}
