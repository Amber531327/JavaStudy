package generics1_interface;

import java.util.ArrayList;

public class StudentData implements Data<Student>{

    @Override
    public void add(Student student) {

    }

    @Override
    public ArrayList<Student> getByName(String name) {
        return null;
    }
}
