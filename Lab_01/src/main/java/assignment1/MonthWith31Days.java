package assignment1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MonthWith31Days extends Date{

    MonthWith31Days(int day, int month, int year)
    {
        super(day, month, year);
        this.setLastDay(31);
    }
}
