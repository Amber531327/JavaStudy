package enum_demo;

public enum B {
    X("张三"){
        @Override
        public void go() {
            System.out.println(name + "在跑");
        }
    },Y(){
        @Override
        public void go() {
            System.out.println("跑跑跑");
            setAge(70);
            System.out.println(getAge());
        }

    };
    public String name;
    private int age;
    B() {
    }
    B(String name) {
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void go();
}
