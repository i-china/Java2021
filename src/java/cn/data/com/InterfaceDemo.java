package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
interface InterfaceDemo {
//    private String name;
    void run();
    String getName();
    void setName(String name);
}


interface InterTest extends InterfaceDemo{
    void say();
    void setAge(int age);
    int getAge();
}