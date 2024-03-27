package assignment2.controlcouplinng;

public class Salary
{
    Employee employee = new Employee();
    public int Calculator(String type)
    {
        if(type == "Permanent")
        {
            return 4000;
        }
        else
        {
            return 3000;
        }
    }
}
// The type parameter passed in the employee class controls the flow of this class.
// This is control coupling.