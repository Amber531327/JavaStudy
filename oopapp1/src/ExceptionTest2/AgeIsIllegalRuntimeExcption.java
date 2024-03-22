package ExceptionTest2;
//自定义运行时异常
//必须让这个类继承自RuntimeException
public class AgeIsIllegalRuntimeExcption extends RuntimeException {
    //先用前两个构造器
    public AgeIsIllegalRuntimeExcption() {
    }

    public AgeIsIllegalRuntimeExcption(String message) {
        super(message);
    }
}
