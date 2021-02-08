package com.jbean.cn;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;

/**
 * @author HaleLv
 * @date 2021-02-08
 **/
public class JavaBeanDemo {
    public static void main(String[] args) throws IntrospectionException {
//        getSet gs = getSet();
        BeanInfo info = Introspector.getBeanInfo(getSet.class);
        for(PropertyDescriptor pd : info.getPropertyDescriptors()){
            System.out.println(pd.getName());
            System.out.println(pd.getReadMethod());
            System.out.println(pd.getWriteMethod());
        }
    }
}

class getSet{
    private String name;
    private int age;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return this.age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public boolean isChild(){
        return age <= 6;
    }
}
