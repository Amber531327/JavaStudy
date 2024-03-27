package Logback;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogbackTest {
    public static final Logger LOGGER= LoggerFactory.getLogger("LogbackTest");
    public static void main(String[] args) {
        try {
            LOGGER.info("程序开始执行");
            divide(5,0);
            LOGGER.info("程序执行失败");
        } catch (Exception e) {
            LOGGER.error("程序出错了");
        }
    }
    public static void divide(int a,int b){
        LOGGER.debug("参数a:"+a);
        LOGGER.debug("参数b："+b);
        double c=a/b;
        LOGGER.info("结果是："+c);
    }

}
