package CollectionTraverse;

import java.util.ArrayList;
import java.util.Collection;

public class For {
    public static void main(String[] args) {
        //c.for
        Collection<String> c=new ArrayList<>();
        c.add("haha");
        c.add("hehe");
        c.add("enen");
        for (String s : c) {
            System.out.println(s);
        }
        int[] arr={2,3,4,5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
