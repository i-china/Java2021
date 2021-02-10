package com.data.cn;

import java.lang.reflect.Field;

/**
 * @author HaleLv
 * @date 2021-02-10
 **/
public final class FanSheDemo {
    private final byte[] value;

    public FanSheDemo(byte[] value) {
        this.value = value;
    }

    public static void main(String[] args) throws Exception {
        Field f = String.class.getDeclaredField("value");
    }
}

