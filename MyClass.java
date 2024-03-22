public class MyClass {
    static int plusMethod(int a,int b){
        return a+b;
    }
    static double plusMethod(double x,double y){
        return x+y;
    }
    public void test(){
        System.out.println("just test");
    }
    public static void main(String[] args){
        System.out.println("Helloe,world\n");
        System.out.println("test\r");
        System.out.println("haha\r\n");
        System.out.println("hehe\n\r");
        System.out.println("gugu");
        System.out.println(Math.abs(-4));
        System.out.println((int)(Math.random()*100));
        String[] Cars={"BMW","Volvo","Mazda","Audi"};
        for (int i=0;i< Cars.length;i++){
            System.out.println(Cars[i]);
        }
        for(String i:Cars){
            System.out.println(i);
        }
        int c=plusMethod(3,5);
        double z=plusMethod(3.34,7.88);
        System.out.println("int:"+c);
        System.out.println("double:"+z);
    }
}
