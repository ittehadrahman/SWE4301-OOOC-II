package assignment1;

import java.util.Arrays;
import java.util.List;

public class MonthWith30Days extends Date
{
    MonthWith30Days(int day, int month, int year){
        super(day, month, year);
        this.setLastDay(30);
    }

}
