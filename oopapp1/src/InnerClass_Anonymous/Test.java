package InnerClass_Anonymous;

public class Test {
    public static void main(String[] args) {
        Animal a=new Animal(){
            @Override
            void cry() {
                System.out.println("哭");
            }
        };
        a.cry();
    }
}
abstract class Animal{
    abstract void cry();
}