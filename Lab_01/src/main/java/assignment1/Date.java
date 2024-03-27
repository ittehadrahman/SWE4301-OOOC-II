package assignment1;

public class Date
{
    private int day;
    private int month;
    private int year;
    private int lastDay;

    Date(int day, int month, int year)
    {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setLastDay(int day){
        this.lastDay = day;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear()
    {
        return this.year;
    }
    public void nextDate()
    {
        if(day == lastDay)
        {
            day = 0;
            if(month == 12)
            {
                month = 1;
                year++;
            }
            else
            {
                month++;
            }
        }
        day++;
    }
    boolean isLeapYear()
    {
        if (this.year % 400 == 0 || (this.year % 4 == 0 && this.year % 100 != 0))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
