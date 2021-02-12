package cn.zhujie.com;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author HaleLv
 * @date 2021-02-12
 **/
public class MakeAnnotationDemo {
    public static void main(String[] args) {

    }

    public @interface Report{
        int type() default 0;
        String level() default "info";
        String value() default "";
    }
    @Target(ElementType.METHOD)
    public @interface ReportOne{
        int type() default 0;
        String level() default "info";
        String value() default "";
    }
    @Target({
            ElementType.METHOD,
            ElementType.FIELD
    })
    public @interface AnnoOne{
        int type() default 0;
        String level() default "info";
        String value() default  "";
    }
}

class AnnotationDemos{
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Report{
        int type() default 0;
        String level() default "error";
        String value() default "";
    }


}
