package test1;

import org.junit.*;

public class StringUtilTest {
    @Before//每一次
    public void test1(){
        System.out.println("---> test1 Before 执行了---------");
    }

    @BeforeClass//第一次
    public static void test11(){
        System.out.println("---> test11 BeforeClass 执行了---------");
    }

    @After
    public void test2(){
        System.out.println("---> test2 After 执行了---------");
    }

    @AfterClass
    public static void test22(){
        System.out.println("---> test22 AfterClass 执行了---------");
    }
    @Test//alt+enter引入junit
    public void TestprintNumber(){//右键运行
        StringUtil.printNumber("haha");
        StringUtil.printNumber(null);
    }
    @Test
    public void TestGetMaxIndex(){
        int index=StringUtil.getMaxIndex("hahaha");
        //断言机制
        Assert.assertEquals("程序内部出错",5,index);
        //第一个参数是结果与预期值不同时的提示信息
        //第二个参数是方法返回值的预期结果
        //第三个参数是指哪个参数要与预期值相同
    }
}
