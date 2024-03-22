package ExceptionTest2;

public class ExceptionTest2 {
    public static void main(String[] args) {
        try {
            saveAge(100);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        try {
            saveAge1(199);
        } catch (AgeIsIllegalException e) {
            throw new RuntimeException(e);
        }
    }
    public static void saveAge(int age){
        if (age>0&&age<150){
            System.out.println("your age is saved:" + age);
        }else {
            //用一个异常对象封装这个问题
            throw new AgeIsIllegalRuntimeExcption("age is illegal:"+age);
        }
    }
    public static void saveAge1(int age) throws AgeIsIllegalException{
        if (age>0&&age<150){
            System.out.println("your age is saved:" + age);
        }else {
            //throw抛出这个异常对象
            //编译时异常不管正确与否都会报错，要用throws给抛到上层去
            throw new AgeIsIllegalException("age is illegal:"+age);
        }
    }
}
