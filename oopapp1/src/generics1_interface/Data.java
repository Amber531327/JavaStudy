package generics1_interface;

import java.util.ArrayList;

public interface Data <E>{
    void add(E e);
    ArrayList<E> getByName(String name);
}
