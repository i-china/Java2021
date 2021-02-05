package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class JubuVariable {
    public void pupAge(){
        int age = 0;
        age = age + 9;
        System.out.println("Dog age is "  + age);
    }

    public static void main(String[] args) {
        JubuVariable jb = new JubuVariable();
        jb.pupAge();
    }
}
