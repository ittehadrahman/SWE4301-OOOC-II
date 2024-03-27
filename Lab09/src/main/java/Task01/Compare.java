package Task01;

import java.util.Comparator;

public class Compare implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        return o1.getID().compareTo(o2.getID());
    }
}
