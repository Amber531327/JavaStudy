package InnerClass_Anonymous;

public class Test1 {
    public static void main(String[] args) {
        Swimming s1=new Swimming(){
            @Override
            public void swim() {
                System.out.println("cat is swimming");
            }
        };
        go(s1);
        go(new Swimming(){
            @Override
            public void swim() {
                System.out.println("DOG is swimming");
            }
        });
    }
    public static void go(Swimming s){
        s.swim();
    }
}
interface Swimming{
    public void swim();
}
