package generics_method;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<>();
        cars.add(new BENZ());
        cars.add(new BMW());
        go(cars);
        ArrayList<BMW> bmw=new ArrayList<>();
        bmw.add(new BMW());
        go(bmw);
        ArrayList<DOG> dog=new ArrayList<>();
        dog.add(new DOG());
        //泛型不支持基本数据类型，只能支持对象类型（引用数据类型
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<Double> list2=new ArrayList<>();

    }
    public static <T> ArrayList<T> test(int t){
        ArrayList<T> list=new ArrayList<>();
        return list;
    }//?
    public static <T> void test1(ArrayList<Car> t){

    }
    public static <T extends Car> ArrayList<T> go(ArrayList<T> car){
        return car;
    }
    //也可以用通配符
    public static void goo(ArrayList<? extends Car> cars){

    }
}
