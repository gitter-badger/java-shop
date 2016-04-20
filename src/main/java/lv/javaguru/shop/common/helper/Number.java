package lv.javaguru.shop.common.helper;

import java.util.concurrent.ThreadLocalRandom;

public class Number {
    private Number() {

    }

    public static int getRandomIntegerBetween(int firstNumber, int secondNumber) {
        return ThreadLocalRandom.current().nextInt(firstNumber, secondNumber + 1);
    }
}
