package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class AutoChangeType {
    public static void main(String[] args) {
//        定义一个char类型
        char a1 = 'A';
//        char类型自动转换为int类型
        int i1 = a1;
//        转换后int的值
        System.out.println("char类型自动转换为int类型" + i1);
//      定义一个char类型
        char c1 = 'a';
//        char类型和int类型计算
        int i2 = c1;
        System.out.println("char类型自动转换为int类型" + i2 + 1);
    }
}
