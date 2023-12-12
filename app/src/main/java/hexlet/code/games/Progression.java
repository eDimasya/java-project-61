package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Utils;

import static hexlet.code.Utils.AMOUNT_OF_WINS_FOR_VICTORY;

public class Progression {
    /**
     * Start the game.
     *
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

    private static String getInitQuestion() {
        return "What number is missing in the progression?";
    }

    private static String askQuestion() {
        int[] progression = createProgression();
        int absentNumberPosition =
                Utils.generateRandomNum(0, progression.length - 1);
        String correctAnswer =
                String.valueOf(progression[absentNumberPosition]);
        StringBuilder question = new StringBuilder();
        for (int i = 0; i < progression.length; i++) {
            if (i == absentNumberPosition) {
                question.append("..");
            } else {
                question.append(progression[i]);
            }
            question.append(" ");
        }
        Utils.printQuestion(question.toString());
        return correctAnswer;
    }

    /**
     * @return sequence of num in progression
     */
    private static int[] createProgression() {
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
        progression[0] = begin;
        for (int i = 1; i < amount; i++) {
            progression[i] = progression[i - 1] + gap;
        }
        return progression;
    }
}
