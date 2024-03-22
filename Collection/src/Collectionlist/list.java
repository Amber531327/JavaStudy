package Collectionlist;

import java.util.ArrayList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println(list);
        list.add(1,"e");
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.set(0, "0"));
        System.out.println(list.get(0));
    }
}
