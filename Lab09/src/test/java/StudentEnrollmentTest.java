import Task01.Program;
import Task01.Student;
import Task01.StudentEnrollment;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StudentEnrollmentTest {
    @Test
    public void add()
    {
        Student student = new Student();
        StudentEnrollment studentEnrollment = new StudentEnrollment();
        student.ID="200042131";
        student.CGPA = (float) 3.74;
        student.program = Program.SWE;
        student.Name = "Sami";
        studentEnrollment.addStudent(new Student());
        student.ID="200042132";
        student.CGPA = (float) 3.74;
        student.program = Program.SWE;
        student.Name = "Muaz";
        studentEnrollment.addStudent(new Student());
        assertEquals(2, studentEnrollment.getSize());
    }
    @Test
    public void remove()
    {
        Student student = new Student();
        StudentEnrollment studentEnrollment = new StudentEnrollment();
        student.ID="200042131";
        student.CGPA = (float) 3.74;
        student.program = Program.SWE;
        student.Name = "Sami";
        studentEnrollment.addStudent(student);
        student = new Student();
        student.ID="200042132";
        student.CGPA = (float) 3.74;
        student.program = Program.SWE;
        student.Name = "Muaz";
        studentEnrollment.addStudent(student);
        studentEnrollment.Remove("200042131");
        assertEquals(1, studentEnrollment.getSize());
    }

    @Test
    public void student()
    {
        Student student = new Student();
        StudentEnrollment studentEnrollment = new StudentEnrollment();
        student.ID="200042131";
        student.CGPA = (float) 3.74;
        student.program = Program.SWE;
        student.Name = "Sami";
        studentEnrollment.addStudent(student);
        String sami = "200042131 Sami ";
        float cgpa= (float)3.74;
        String program = " SWE";

    }

}
