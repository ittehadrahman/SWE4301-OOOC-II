package Task01;

import java.util.List;

public class SortByID implements Ipublish{
    @Override
    public String publish(List<Student> students) {
        String list="";
        students.sort(new Compare());
        for(int i=0;i< students.size();i++)
        {
            list += students.get(i).getID()+" "+students.get(i).Name+" "+students.get(i).CGPA+"\n";
        }
        return list;
    }
}
