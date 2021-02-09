package com.java.cn;

import java.math.BigDecimal;
import java.sql.SQLOutput;

/**
 * @author HaleLv
 * @date 2021-02-09
 **/
public class BigDecimalDemo {
    public static void main(String[] args) {
        BigDecimall aa = new BigDecimall();
    }
}

class BigDecimall {
    BigDecimall() {
        BigDecimal bd = new BigDecimal("123.23");
        BigDecimal aa = new BigDecimal("123213.12321");
        System.out.println(aa);
        System.out.println(aa.scale());
    }
}
