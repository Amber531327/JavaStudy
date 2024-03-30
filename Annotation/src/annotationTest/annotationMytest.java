package annotationTest;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class annotationMytest {
    // @MyTest
    public void test1(){
        System.out.println("===test1====");
    }

    @MyTest
    public void test2(){
        System.out.println("===test2====");
    }

    @MyTest
    public void test3(){
        System.out.println("===test3====");
    }

    @MyTest
    public void test4(){
        System.out.println("===test4====");
    }

    public static void main(String[] args) throws Exception {
        annotationMytest a = new annotationMytest();
        Class c= annotationMytest.class;
        for (Method declaredMethod : c.getDeclaredMethods()) {
            if(declaredMethod.isAnnotationPresent(MyTest.class)){
                declaredMethod.invoke(a);
            }
        }

    }
}
