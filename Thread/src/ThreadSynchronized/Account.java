package ThreadSynchronized;

public class Account {
    private String ID;
    private int money;

    public Account(String ID, int money) {
        this.ID = ID;
        this.money = money;
    }
    //静态方法里面的锁用类名
    public static void test(){
        synchronized (Account.class){

        }
    }
    //实例方法里面的就用this
    public void drawMoney(int money){
        String name = Thread.currentThread().getName();
        synchronized (this) {
            if (this.money>=money){
                System.out.println(name + "取钱成功！");
                this.money-=money;
            }else {
                System.out.println("余额不足");
            }
            System.out.println("现在余额还有" + this.money);
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
