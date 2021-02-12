package cn.zhujie.com;

import java.lang.annotation.*;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class InheritedDemo {
    public static void main(String[] args) {

    }
}

@Inherited
@Target(ElementType.TYPE)
@interface Reports{
    int type() default 0;
    String level() default "debug";
    String value() default "";
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@interface Range{
    int main() default 0;
    int max() default 266;
}
/*

class Er{
    @Range(min=1,max=20)
    public String name;

    @Range(max=10)
    public String city;
    
    void check(Range range) {
        for(Field field : range.getClass().getFields()){
            Range rang  = field.getAnnotation(Range.class);
            if(rang != null){
                Object value = field.get(range);
                if(value instanceof String){
                    String s = (String) value;
                    if(s.length() < range.min() || s.length() > range.max()){
                        throw new IllegalArgumentException("Invalid field " + field.getName());
                    }
                }
            }
        }
    }
}
*/


/*
@Report(type=1)
class Person{

}
*/
