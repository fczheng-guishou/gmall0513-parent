package com.atguigu.gmall0513.mock.util;

/**
 * @author fczheng
 * @create 2019-10-18 19:54
 */
public class RanOpt<T> {
    T value;
    int weight;

    public RanOpt(T value, int weight) {
        this.value = value;
        this.weight = weight;
    }

    public T getValue() {
        return value;
    }

    public int getWeight() {
        return weight;
    }
}

