package thisDemo;

public class StudentDemo {
    String Name;
    int score;
    public void getInto(int score){
        if (this.score>score){
            System.out.println("恭喜"+Name+"已经被成功录取");//加不加this都一样
        }
        else {
            System.out.println("落选了！");
        }
    }
}
