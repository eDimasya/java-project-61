package hexlet.code;

import java.util.Random;

public class Utils {

    public static int generateRandomNum() {
        final int min = 1;
        final int max = 100;
        return generateRandomNum(min, max);
    }

    public static int generateRandomNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

}
