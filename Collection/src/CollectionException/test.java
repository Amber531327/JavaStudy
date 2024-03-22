package CollectionException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>();
        names.add("ambwe");
        names.add("abby");
        names.add("dors");
        names.add("bb");
        names.add("abyi");
        Iterator<String> it = names.iterator();
        //用迭代器遍历集合
//        while (it.hasNext()){
//            if (it.next().contains("a")){
//                it.remove();//要用迭代器本身的remove，否则出现并发异常
//            }
//        }
//        System.out.println(names);
        //用for循环,也可以倒着删除，因为每删除一个元素，后面的元素会自动向前
        for (int i = 0; i < names.size(); i++) {
            String name=names.get(i);
            if (name.contains("a")){
                names.remove(i);
                i--;
            }
        }
        System.out.println(names);
        //用增强for循环和lambda表达式没有办法解决并发异常


    }
}
