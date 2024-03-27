package assignment1;

public class February extends Date{
    February(int day, int year)
    {
        super(day, 2, year);
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
        {
            this.setLastDay(29);
        }
        else
        {
            this.setLastDay(28);
        }
    }
}

