package Lambda;

public class Lambda {
    public static void main(String[] args) {
//        swimming s=new swimming() {
//            @Override
//            public void swim() {
//                System.out.println("swim");
//            }
//        };
        swimming s=()-> {
            System.out.println("swim");
        };

    }
}
interface swimming{
    public void swim();
}
