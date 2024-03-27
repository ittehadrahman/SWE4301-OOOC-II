package Task03;

public class Permanent extends Worker implements Wage, Vacation{
    public Permanent()
    {
        String workingTime1= this.workingTime;
        int workingDays1 = this.workingDays;
        int baseWage1 = this.baseWage;
    }

    @Override
    public double yearlyVacation()
    {
        return 20 + workingDays * 0.03;
    }
    @Override
    public double yearlyWage()
    {
        return 12 * (baseWage + baseWage *0.3 + baseWage * 2);
    }
}
