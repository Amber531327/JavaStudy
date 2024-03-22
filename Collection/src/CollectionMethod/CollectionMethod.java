package CollectionMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

public class CollectionMethod {
    public static void main(String[] args) {
        Collection<String> c=new ArrayList<>();//多态
        c.add("haha");
        c.add("hehe");
        c.add("haha");
        Collection<String> c1=new ArrayList<>();
        c1.addAll(c);
        c.clear();
        c1.remove("haha");//删除元素中第一个
        Object[] o=c1.toArray();
        System.out.println(c1);
        System.out.println(Arrays.toString(o));

    }
}
