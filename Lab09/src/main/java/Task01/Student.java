package Task01;

public class Student
{
    public  String ID;
    public  String Name;
    public Program program;
    public float CGPA;

    public void Study()
    {
        System.out.println("Study");
    }
    public void Play()
    {
        System.out.println("Play");
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) throws InvalidStudentIDException {
        if(ID.length()!=9)
        {
            throw new InvalidStudentIDException("ID should be of length 9");
        }
        else
        {
            this.ID = ID;
        }
    }
}
