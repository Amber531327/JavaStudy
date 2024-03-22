package generics_class;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add(new Cat());
//        for (int i = 0; i < list.size(); i++) {
//            String n=(String) list.get(i);
//            System.out.println(n);
//        }generics.Cat cannot be cast to class java.lang.String
        ArrayList<String> list1=new ArrayList<>();
        list1.add("d");
//        list1.add(new Cat());报错
        for (int i = 0; i < list1.size(); i++) {
            String m=list1.get(i);
            System.out.println(m);
        }
    }
}
class Cat{

}