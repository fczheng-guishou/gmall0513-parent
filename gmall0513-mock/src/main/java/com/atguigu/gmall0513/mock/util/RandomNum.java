package com.atguigu.gmall0513.mock.util;

/**
 * @author fczheng
 * @create 2019-10-18 19:56
 */

import java.util.Random;

public class RandomNum {
    public static final int getRandInt(int fromNum, int toNum) {
        return fromNum + new Random().nextInt(toNum - fromNum + 1);
    }
}
