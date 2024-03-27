package lab5.task3;

public class Student extends Person {
    int studentID;
    @Override
    public String toString()
    {
        return "Name: "+name+"\nAddress: "+address+"\nAge: "+age+"\nStudentID: "+studentID;
    }
}
