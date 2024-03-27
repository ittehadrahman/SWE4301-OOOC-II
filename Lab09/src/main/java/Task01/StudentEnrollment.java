package Task01;

import java.util.ArrayList;
import java.util.List;

public class StudentEnrollment
{
    List<Student> students = new ArrayList<>();
    public void Remove(String studentID)
    {
        for(int i=0;i< students.size();i++)
        {
            if(students.get(i).getID().equals(studentID))
            {
                students.remove(i);
            }
        }
    }
    public void getStudent(String studentID)
    {
        for (Student student : students) {
            if (student.getID().equals(studentID)) {
                System.out.println(student.ID + " ");
                System.out.println(student.Name + " ");
                System.out.println(student.CGPA + " ");
                System.out.println(student.program + "\n");
            }
        }
    }
    public int getSize()
    {
        return students.size();
    }

    public List<Student> getAll()
    {
        return students;
    }
    public void addStudent(Student student)
    {
        students.add(student);
    }
    public void RemoveStudent(Student student)
    {
        for(int i=0;i< students.size();i++)
        {
            if(students.get(i).getID().equals(student))
            {
                students.remove(i);
            }
        }
    }
    public String getStudent(Student studentID)
    {
        for(int i=0;i< students.size();i++)
        {
            if(students.get(i).getID().equals(studentID))
            {
                return students.get(i).ID+" "+students.get(i).Name+" "+ students.get(i).CGPA+" "+ students.get(i).program+"\n";
            }
        }
        return null;
    }
    public void Print()
    {
        for(int i=0;i< students.size();i++)
        {
            System.out.println(students.get(i).ID+" ");
            System.out.println(students.get(i).Name+" ");
            System.out.println(students.get(i).CGPA+" ");
            System.out.println(students.get(i).program+"\n");
        }
    }
    public List<Student> getList() {
        return students;
    }
}
