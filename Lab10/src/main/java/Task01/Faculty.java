package Task01;

import java.util.ArrayList;
import java.util.List;

@DevelopmentHistory(version = 1,developer = "Sami",tester = "Jarif")
public class Faculty {
    String name;
    String designation;
    int salary;
    List<Course> courseList=new ArrayList<>();

    public Faculty(String name,String designation,int salary,List<Course> courseList)
    {
        this.name=name;
        this.designation=designation;
        this.salary=salary;
        for(Course c:courseList)
        {
            courseList.add(c);
        }
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 1,developer = "Sami", tester = "Jarif"), reviewer = {"Apurbo","Apubro"})
    public Faculty(String name,String designation,int salary)
    {
        this.name=name;
        this.designation=designation;
        this.salary=salary;
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 1,developer = "Sami",tester = "Apurbo"), reviewer = "Mirza")
    void teach(Course course)
    {
        System.out.println("teaching " + course);
    }
    @DevelopmentHistoryWithReviewer(developmentHistory = @DevelopmentHistory(version = 1,developer = "Sami",tester = "Apurbo"), reviewer = "Mirza")
    void research(String topic)
    {
        System.out.println("Researching on: " + topic);
    }

}
