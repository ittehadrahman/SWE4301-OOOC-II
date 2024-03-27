package lab5.task3;

public class Faculty extends Person{
    String designation;
    @Override
    public String toString()
    {
        return "Name: "+name+"\nAddress: "+address+"\nAge: "+age+"\ndesignation: "+designation;
    }
}
