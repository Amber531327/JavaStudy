package annotationTest;

@MyTest1(aaa="haha",ccc={"bbb","ccc"})
public class annotation {
    @MyTest1(aaa="eee",bbb = false,ccc = {"adsa"})
    public void test(){

    }

    @MyTest2(aaaa = 2)
    public void test2(){

    }

}
