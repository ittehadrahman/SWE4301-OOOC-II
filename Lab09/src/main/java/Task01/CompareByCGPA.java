package Task01;

import java.util.Comparator;

public class CompareByCGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return Float.compare(o1.CGPA, o2.CGPA);
    }
}
