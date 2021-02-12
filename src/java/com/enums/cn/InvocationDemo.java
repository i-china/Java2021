package com.enums.cn;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class InvocationDemo {
    public static void main(String[] args) {

    }
}

interface Hello{
    void hi(String name);
}

class hale implements Hello {
    public void hi(String name){
        System.out.println("hi");
    }
}
