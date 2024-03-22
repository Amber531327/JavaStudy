package Integer;

public class valueof {
    public static void main(String[] args) {
        String ageStr="23";
//        int age1=Integer.parseInt(ageStr);
        int age=Integer.valueOf(ageStr);
        System.out.println(age);
        String scoreStr="99.5";
        double score=Double.valueOf(scoreStr);
        System.out.println(score);
    }
}
