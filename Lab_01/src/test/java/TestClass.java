import assignment1.Date;

import assignment1.DateException;
import assignment1.CalenderDate;
import org.junit.jupiter.api.Test;

public class TestClass
{
    @Test
    public void NextDate() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(1,1,2021);
        System.out.println(calenderDate.getNextDate());
    }
    @Test
    public void MonthErrorTest()
    {
        try{
            CalenderDate calenderDate = new CalenderDate(31, 13, 2022);
            System.out.println(calenderDate.getNextDate());
        }
        catch (DateException e){
            System.out.println("Month Exception Caught");
        }
    }

    @Test
    public void ErrorDateOf30DayMonth()
    {
        try
        {
            CalenderDate calenderDate = new CalenderDate(31, 04, 2022);
            System.out.println(calenderDate.getNextDate());
        }
        catch (DateException e){
            System.out.println("Wrong Input for a Date");
        }
    }
    @Test
    public void LastDayOfYear() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(31,12,2022);
        System.out.println(calenderDate.getNextDate());
    }

    @Test
    public void AnyDayLastMonth() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(28,12,2022);
        System.out.println(calenderDate.getNextDate());
    }


    @Test
    public void LastDateOf30DayMonth() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(30,04,2022);
        System.out.println(calenderDate.getNextDate());
    }

    @Test
    public void LastDateOf31DayMonth() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(31,01,2022);
        System.out.println(calenderDate.getNextDate());
    }

    @Test
    public void LastDateOfFebruary() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(28,02,2022);
        System.out.println(calenderDate.getNextDate());
    }
    @Test
    public void LeapYearTest() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(28,02,2020);
        System.out.println(calenderDate.getNextDate());
    }
    @Test
    public void LastDateOfFebLeapYear() throws DateException
    {
        CalenderDate calenderDate = new CalenderDate(29,02,2020);
        System.out.println(calenderDate.getNextDate());
    }
}
