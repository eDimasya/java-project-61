package hexlet.code;

public class Engine {

    /**
     * Ask user a game question.
     *
     * @param question Question expression
     */
    public static void askQuestion(String question) {
        Utils.printQuestion(question);
    }

    /**
     * Take user answer.
     *
     * @return User answer
     */
    public static String takeAnswer() {
        return Utils.setUserAnswer();
    }

    /**
     * Answers checker.
     *
     * @param userAnswer    User Answer
     * @param correctAnswer Correct Answer
     * @param username      Username
     * @return result of checking answer
     */
    public static boolean checkAnswer(String correctAnswer, String userAnswer, String username) {
        if (correctAnswer.equals(userAnswer)) {
            Utils.printIsCorrect();
            return true;
        } else {
            Utils.printAnswerIsWrong(userAnswer, correctAnswer, username);
            return false;
        }
    }

}
