package Task01;

import java.util.Comparator;

public class CompareByIDCGPA implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int compareCGPA = Float.compare(o1.CGPA, o2.CGPA);
        if(compareCGPA == 0)
        {
            return o1.getID().compareTo(o2.getID());
        }
        else
        {
            return compareCGPA;
        }
    }
}
