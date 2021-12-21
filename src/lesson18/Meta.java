package lesson18;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();

    int val();
}

public class Meta {
    @MyAnno(str = "two  args", val = 19)
    public static void myMeth(String str,int i){
        Meta ob = new Meta();
        try{
            Class<?> c = ob.getClass();
            Method m = c.getMethod("myMeth",String.class,int.class);
            MyAnno anno = m.getAnnotation(MyAnno.class);
            System.out.println(anno.str() + " "+ anno.val());
        }catch (NoSuchMethodException e){
            System.out.println("Method not found");
        }
    }

    public static void main(String[] args) {
        myMeth("test",10);
    }
}
