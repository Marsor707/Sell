package com.github.marsor707.utils;

/**
 * Author: Marsor
 * Github: https://github.com/Marsor707
 * Email: 369135912@qq.com
 */
public class MathUtil {

    private static final Double MONEY_RANGE = 0.01;

    public static boolean equals(Double d1, Double d2) {
        Double result = Math.abs(d1 - d2);
        return result < MONEY_RANGE;
    }
}
