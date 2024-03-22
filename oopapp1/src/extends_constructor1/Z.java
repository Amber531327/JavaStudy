package extends_constructor1;

public class Z extends F {
    String skill;

    public Z(String name, int age,String skill) {
        super(name,age);
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }
}
