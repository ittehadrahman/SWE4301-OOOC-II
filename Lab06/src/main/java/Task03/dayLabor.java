package Task03;

public class dayLabor extends Worker implements Wage,Vacation{
    public dayLabor() {
        String workingTime2= this.workingTime;
        int workingDays2 = this.workingDays;
        int baseWage2 = this.baseWage;
    }
    @Override
    public double yearlyWage()
    {
        return 12 * (workingDays * baseWage/25);
    }

    @Override
    public double yearlyVacation()
    {
        return 0;
    }
}
