public class classandproject {
    String fname="amber";
    String sname="tony";
    static void staticMethod(){
        System.out.println("静态方法可以不用创建类的对象来访问该方法");
    }
    public void publicMethod(){
        System.out.println("public只能由对象访问");
    }
    public static void main(String[] arg){
        classandproject project=new classandproject();
        System.out.println(project.fname);
        System.out.println(project.sname);
        staticMethod();
//        publicMethod(); 这会报错
        classandproject publicObj=new classandproject();
        publicObj.publicMethod();
        publicObj.staticMethod();//这会发出警告
        MyClass myObj=new MyClass();
        myObj.test();
    }
}
