package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    /**
     * Game master initialization.
     */
    private final Engine game;

    /**
     * @param username Username
     */
    public Progression(final String username) {
        game = new Engine(username);
    }

    /**
     * Start the game.
     */
    public void startGame() {
        System.out.println("What number is missing in the progression?");
        while (!game.isEndGame()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            game.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int[] progression = createProgression();
        int absentNumberPosition =
                Engine.generateRandomNum(0, progression.length - 1);
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
        Engine.printQuestion(question.toString());
        return correctAnswer;
    }

    /**
     * @return sequence of num in progression
     */
    private int[] createProgression() {
        int minNumBegin = 0;
        int maxNumBegin = 100;
        int minAmount = 5;
        int maxAmount = 10;
        int minGap = -10;
        int maxGap = 10;
        int begin = Engine.generateRandomNum(minNumBegin, maxNumBegin);
        int amount = Engine.generateRandomNum(minAmount, maxAmount);
        int gap = Engine.generateRandomNum(minGap, maxGap);
        int[] progression = new int[amount];
        progression[0] = begin;
        for (int i = 1; i < amount; i++) {
            progression[i] = progression[i - 1] + gap;
        }
        return progression;
    }
}
