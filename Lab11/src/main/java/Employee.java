import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Employee {
    private int ID ;
    private String name ;
    private int experience ;
    private int age;
    private int salary;
    public Employee(String name)
    {
        this.name= name;
    }
    public Employee ( int ID, String name, int experience,int age, int salary ) {
        this . name = name ;
        this.experience = experience;
        this.ID = ID;
        this.age = age;
        this.salary =salary;
    }
    public int getSalary()
    {
        return this.salary;
    }
    public void setID (int newID) {
         this . ID = (int ) ( Math . random () * newID ) ;
    }
    public void setAge(Date birth)
    {
        Calendar calendar = Calendar . getInstance ( Locale. US ) ;
        calendar . setTime ( birth ) ;
        LocalDateTime now = LocalDateTime . now () ;
        this.age = now . getYear () - calendar . get ( Calendar . YEAR ) ;
    }
    public void setExperience ( Date joining ) {
        Calendar calendar = Calendar . getInstance ( Locale. US ) ;
        calendar . setTime ( joining ) ;
        LocalDateTime now = LocalDateTime . now () ;
        int years = now . getYear () - calendar . get ( Calendar . YEAR ) ;
        this . experience = years ;
    }
    @Override
    public String toString () {
         return " Employee {" + "ID=" + ID + ", name = ’" + name + ", experience =" + experience +"}";
    }
    public static void main(String[] args)
    {
        Employee employee = new Employee(123, "Sami", 21, 13,13000);
        employee.setID(23);
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        try{
            Date date = formatter.parse("23-11-2010");
            employee.setExperience(date);
        } catch (ParseException e){
            e.printStackTrace();
        }
    }
}