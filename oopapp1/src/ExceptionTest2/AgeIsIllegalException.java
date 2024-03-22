package ExceptionTest2;
//自定义编译时异常
//必须让这个类继承自Exception
public class AgeIsIllegalException extends Exception {
    //先用前两个构造器
    public AgeIsIllegalException() {
    }

    public AgeIsIllegalException(String message) {
        super(message);
    }
}
