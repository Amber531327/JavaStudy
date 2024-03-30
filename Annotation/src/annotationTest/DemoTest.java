package annotationTest;

import org.junit.Test;

import java.lang.reflect.Method;
import java.util.Arrays;

public class DemoTest {
    @Test
    public void testMytest4CLass(){
        Class c= Demo.class;
        if (c.isAnnotationPresent(MyTest4.class)){
            MyTest4 m=(MyTest4) c.getDeclaredAnnotation(MyTest4.class);
            System.out.println(m.value());
            System.out.println(m.aaa());
            System.out.println(Arrays.toString(m.bbb()));
        }
    }
    @Test
    public void testMytest4Method() throws Exception {
        Class c= Demo.class;
        Method m1=c.getDeclaredMethod("test1");
        if (m1.isAnnotationPresent(MyTest4.class)){
            MyTest4 m=(MyTest4) m1.getDeclaredAnnotation(MyTest4.class);
            System.out.println(m.value());
            System.out.println(m.aaa());
            System.out.println(Arrays.toString(m.bbb()));
        }
    }
}
