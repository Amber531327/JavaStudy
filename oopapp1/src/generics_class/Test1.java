package generics_class;

public class Test1 {
    public static void main(String[] args) {
        MyArrayList<String> list=new MyArrayList<>();
        list.add("haha");
        list.add("hehe");
        System.out.println(list.get(1));

    }


}
