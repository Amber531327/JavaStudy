package ThreadLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String ID;
    private int money;
    private final Lock lk=new ReentrantLock();//建议用final修饰

    public Account(String ID, int money) {
        this.ID = ID;
        this.money = money;
    }

    public void drawMoney(int money){

        String name = Thread.currentThread().getName();
        lk.lock();
        //用trycatchfinally以保证代码块中间出错就不能解锁的情况
        try {

            if (this.money>=money){
                System.out.println(name + "取钱成功！");
                this.money-=money;
            }else {
                System.out.println("余额不足");
            }
            System.out.println("现在余额还有" + this.money);

        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lk.unlock();
        }
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
