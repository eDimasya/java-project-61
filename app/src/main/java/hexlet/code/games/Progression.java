package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
    private Engine engine;

    public Progression(String username) {
        engine = new Engine(username);
    }

    public void startGame() {
        System.out.println("What number is missing in the progression?");
        while (!engine.isEndGame()) {
            String correctAnswer = askQuestion();
            String userAnswer = Engine.setUserAnswer();
            engine.checkAnswer(userAnswer, correctAnswer);
        }
    }

    private String askQuestion() {
        int[] progression = createProgression();
        int absentNumberPosition = Engine.generateRandomNum(0, progression.length - 1);
        String correctAnswer = String.valueOf(progression[absentNumberPosition]);
        String question = "";
        for (int i = 0; i < progression.length; i++) {
            if (i == absentNumberPosition) {
                question += "..";
            } else {
                question += progression[i];
            }
            question += " ";
        }
        Engine.printQuestion(question);
        return correctAnswer;
    }

    private int[] createProgression() {
        int begin = Engine.generateRandomNum(0, 100);
        int amount = Engine.generateRandomNum(5, 10);
        int gap = Engine.generateRandomNum(-10, 10);
        int[] progression = new int[amount];
        progression[0] = begin;
        for (int i = 1; i < amount; i++) {
            progression[i] = progression[i - 1] + gap;
        }
        return progression;
    }
}
