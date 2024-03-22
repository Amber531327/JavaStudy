package encapsulation;

public class Score {
    private int score;
    public void setScore(int score){
        this.score=score;
        if (score>=0){
            System.out.println("数据合格");
        }else {
            System.out.println("数据不合格");
        }
    }
    public int getScore(){
        return score;
    }
}
