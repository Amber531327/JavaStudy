package Collectionlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class traverse {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        //增强for循环list.for
        for (String s : list) {
            System.out.println(s);
        }
        //for循环 list.fori
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        //迭代器
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        //Lambda表达式 list.foreach
        list.forEach(s -> {
            System.out.println(s);
        });
    }
}
