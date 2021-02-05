package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class finalDemo {
//    final :最后的，最终的含义，不能被重新赋值，必须指定初始值
//    final  + static 创建类变量
    final int age = 23;
    public static final int boxwidth = 6;
    static final String name = "Hale";

    public void changeValue(){
//        错误输出
        //        age = 23;
    }
    public final void finalDemo(){
        System.out.println();
    }

}
