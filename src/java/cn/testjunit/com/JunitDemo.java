package cn.testjunit.com;

import org.junit.Test;
import org.junit.jupiter.api.Disabled;

/**
 * @Author: HaleLv
 * @Date: 2021-03-01
 * @ProjectName Java2021
 */

public class JunitDemo {
    public static void main(String[] args) {

    }

    @Disabled
    @Test
    public void TestDemos(){
        System.out.println("hi");
    }


}
