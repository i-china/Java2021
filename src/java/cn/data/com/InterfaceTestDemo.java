package cn.data.com;

/**
 * @author HaleLv
 * @date 2021-02-07
 **/
public class InterfaceTestDemo  {
    public static void main(String[] args) {
        InterDemo id = new InterDemo();
        id.run();
        id.setName("Hale");
        String n = id.getName();
        System.out.println(n);
    }
}

class InterDemo implements InterfaceDemo {
    private String name;
    @Override
    public void run(){
        System.out.println("Interface run ");
    }

    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }


}
