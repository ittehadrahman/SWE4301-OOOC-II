public class Enum {
    public static void main(String[] args)
    {
        DaysOfWeek day = DaysOfWeek.thursday;

        if(day==DaysOfWeek.thursday)
        {
            System.out.println("Yay its almost friday");
        }
        for(DaysOfWeek myDay: DaysOfWeek.values())
        {
            System.out.println(myDay);
        }
    }
}
