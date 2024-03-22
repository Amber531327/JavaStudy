package CollectionTraverse;

import java.util.ArrayList;
import java.util.Collection;

public class Iterator {
    public static void main(String[] args) {
        //alt+enter快速补全代码
        Collection<String> c=new ArrayList<>();
        c.add("haha");
        c.add("hehe");
        c.add("enen");
        java.util.Iterator<String> iterator = c.iterator();
        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
