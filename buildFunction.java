public class buildFunction {
    int x;
    public buildFunction(int y){//构造函数名称必须与类名匹配，并且不能有返回类型(如 void
       x=y;
    }
    public static void main(String args[]){
        buildFunction myObj=new buildFunction(5);
        System.out.println(myObj.x);
/*在创建对象时会调用构造函数。
默认情况下，所有类都有构造函数：如果您自己不创建类构造函数，Java会为您创建一个。但是，您无法设置对象属性的初始值。*/
    }
}
