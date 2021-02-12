package cn.zhujie.com;


import java.lang.annotation.*;

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
    public @interface Report {
        int type() default 0;

        String level() default "error";

        String value() default "";
    }
    @Target(ElementType.TYPE)
    public @interface ReportTwo{
        int type() default 0;
        String level() default "info";
        String value() default "";
    }
}

class AnnotaionONE{
    @Target(ElementType.TYPE)
    public @interface Report{
        int type() default 0;
        String level() default "info";
        String value() default "";
    }
    @Target(ElementType.TYPE)
    public @interface Reports{
        Report[] value();
    }
}

class AnnotationTwo{
    @Retention(RetentionPolicy.RUNTIME)
    public @interface Report{
        int type() default 0;
        String level() default "WARNING";
        String value() default "";
    }
    @Target(ElementType.TYPE)
    public @interface Reports{
        Report[] value();
    }
}

class Repeatabe{
    @Repeatable(Reports.class)
    @Target(ElementType.TYPE)
    public @interface Report{
        int type() default 0;
        String level() default "WARNING";
        String value() default "";
    }

    @Target(ElementType.TYPE)
    public @interface Reports{
        Report[] value();
    }
}


