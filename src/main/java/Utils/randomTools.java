package Utils;

import java.util.Random;

public class randomTools {
    public static int getNumber() {
        Random random = new Random();
        return random.nextInt(1000);
    }
}
