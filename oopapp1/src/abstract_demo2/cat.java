package abstract_demo2;

public class cat extends Animal{
    @Override
    public void cry(){
        System.out.println(getName() + "在哭");
    }
}
