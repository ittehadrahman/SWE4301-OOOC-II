package assignment1;
import java.util.*;
public class CalenderDate
{
    List<Integer> ThirtyDays =Arrays.asList(4,6,9,11);
    List<Integer> ThirtyOneDays =Arrays.asList(1,3,5,7,8,10,12);
    Date date;
    public CalenderDate(int day, int month, int year) throws DateException
    {
        if(ThirtyDays.contains(month))
        {
            if(day>30 || day<1)
            {
                throw new DateException("Date is incorrect");
            }
            this.date = new MonthWith30Days(day,month,year);
        }
        else if(ThirtyOneDays.contains(month))
        {
            if(day>31 || day<1)
            {
                throw new DateException("Date is incorrect");
            }
            this.date = new MonthWith31Days(day,month,year);
        }
        else if(month == 2)
        {
            if(day>29 || day<1)
            {
                throw new DateException("Date is incorrect");
            }
            this.date = new February(day, year);
        }
        else
        {
            throw new DateException("Date is incorrect");
        }
    }
    public String getNextDate()
    {
        date.nextDate();
        return date.getDay() + "-" + date.getMonth() + "-" + date.getYear();
    }
}


