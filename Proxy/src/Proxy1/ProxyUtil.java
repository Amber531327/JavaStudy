package Proxy1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    //代理返回的是一个接口
    //代理和实现类共同完成一件事情。
    // 先创建一个接口，里面申明代理要做的事情，然后再创建实现类，来实现代理干的事以外的事情
    //创建一个创建代理的类，里面有一个创建代理的静态方法，返回的是一个代理。
    //使用(Star) Proxy.newProxyInstance()方法，第一个参数硬记，第二个参数是一个Class数组，里面装的所有接口.Class
    //第三个参数是代理对象要干的事情，里面包括代理和对象共同完成的事情中代理要做的事情，并且要使用invoke方法来激活对象要完成的事情，主要作用是传参
    //最后返回这个代理（接口）
    public static  Star createProxy(BigStar bigStar){
        Star starProxy=(Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(),
                new Class[]{Star.class}, new InvocationHandler() {
                    @Override//重调方法
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable { // 代理对象要做的事情，会在这里写代码
                        if (method.getName().equals("sing")){
                            System.out.println("准备话筒，"+bigStar.getName()+"要开始唱歌了！");
                        } else if (method.getName().equals("dance")) {
                            System.out.println("准备舞台，" + bigStar.getName() + "要开始跳舞了");
                        }
                        return method.invoke(bigStar,args);
                    }
                }
        );
        return starProxy;
    }
}
