package generics_class;

public class MyArrayList<E> {
    //注意<>中可以传入多个数据类型
    //<E extends Animal>代表传入的必须是Animal的子类或者它本身
    private Object[] arr=new Object[10];
    private int size;
    public boolean add(E e){
        arr[size++]=e;
        return true;
    }
    public  E get(int index){
        return (E) arr[index];//强转，否则会默认是object类然后报错
    }

}
