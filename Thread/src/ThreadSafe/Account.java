package ThreadSafe;

public class Account {
    private String ID;
    private int money;

    public Account(String ID, int money) {
        this.ID = ID;
        this.money = money;
    }
    public void drawMoney(int money){
        String name = Thread.currentThread().getName();
        if (this.money>=money){
            System.out.println(name + "取钱成功！");
            this.money-=money;
        }else {
            System.out.println("余额不足");
        }
        System.out.println("现在余额还有" + this.money);
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
