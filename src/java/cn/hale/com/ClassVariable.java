package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class ClassVariable {
    private static String classVar = "hale ";

    public static final String DEPARTMENT = "dev";
    public static void main(String[] args) {
        System.out.println(DEPARTMENT + classVar);
    }
}
