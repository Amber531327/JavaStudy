package InnerClass;

public class Outer {
    private int age=99;
    public class Inner{
        private int age=88;
        public void test(){
            //int age=100;
            //这下面的age就是从方法->内部类->外部类依次找出去的
            System.out.println(age);//100
            //System.out.println(this.age);//88
            System.out.println(Outer.this.age);//99
        }
    }
}
