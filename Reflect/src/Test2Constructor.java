import org.junit.Test;

import java.lang.reflect.Constructor;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 目标：掌握获取类的构造器，并对其进行操作。
 */
public class Test2Constructor {
    @Test
    public void testGetConstructors(){
        // 1、反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2、获取类的全部构造器
        // Constructor[] constructors = c.getConstructors();//只能是公共的
        Constructor[] constructors = c.getDeclaredConstructors();
        // 3、遍历数组中的每个构造器对象
        for (Constructor constructor : constructors) {
            System.out.println(constructor.getName() + "--->"
                    + constructor.getParameterCount());
        }
    }

    @Test
    public void testGetConstructor() throws Exception {
        // 1、反射第一步：必须先得到这个类的Class对象
        Class c = Cat.class;
        // 2、获取类的某个构造器：无参数构造器
        Constructor constructor1 = c.getDeclaredConstructor();
        System.out.println(constructor1.getName() + "--->"
                + constructor1.getParameterCount());
        constructor1.setAccessible(true); // 禁止检查访问权限
        Cat cat = (Cat) constructor1.newInstance();//注意这里要用强转或者在前面使用泛型
        System.out.println(cat);

        AtomicInteger a;


        // 3、获取有参数构造器
        Constructor constructor2 =
                c.getDeclaredConstructor(String.class, int.class);//注意要加class才能变成对象
        System.out.println(constructor2.getName() + "--->"
                + constructor2.getParameterCount());
        constructor2.setAccessible(true); // 禁止检查访问权限，这样之后就可以调用private构造器
        Cat cat2 = (Cat) constructor2.newInstance("叮当猫", 3);
        System.out.println(cat2);

    }
}


