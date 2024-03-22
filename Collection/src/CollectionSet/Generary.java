package CollectionSet;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Generary {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();//不重复，无索引，无序
        set.add(555);
        set.add(666);
        set.add(777);
        set.add(555);
        System.out.println(set);
        Set<Integer> set1=new TreeSet<>();//不重复，无索引，默认升序
        set1.add(555);
        set1.add(888);
        set1.add(777);
        set1.add(555);
        System.out.println(set1);
        Set<Integer> set2=new LinkedHashSet<>();//不重复，无索引，有序
        set2.add(555);
        set2.add(888);
        set2.add(777);
        set2.add(555);
        System.out.println(set2);
    }
}
