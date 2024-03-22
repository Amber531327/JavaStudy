package api;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();//不加<>指定数据类型就代表什么数据类型都可以存储
        list.add("haha");
        list.add("baba");
        list.add("hehe");
        System.out.println(list);
        list.add(1,"hehe");
        System.out.println(list);
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.remove("hehe"));//返回删除是否成功
        System.out.println(list.remove(0));//返回被删除的元素
        System.out.println(list.set(1, "amber"));//会返回被修改的元素
    }
}
