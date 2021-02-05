package cn.hale.com;

/**
 * @author HaleLv
 * @date 2021-02-05
 **/
public class InstanceCounter {
    private static int numInstances = 0;
    protected static int getCount() {
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    InstanceCounter() {
        InstanceCounter.addInstance();
    }

    public static void main(String[] args) {
        System.out.println("Start with " + InstanceCounter.getCount() + " instance ");
        for (int i = 0; i < 5000; i++) {
            new InstanceCounter();
        }
        System.out.println("Created"  + InstanceCounter.getCount() + " Instances ");
    }
}
