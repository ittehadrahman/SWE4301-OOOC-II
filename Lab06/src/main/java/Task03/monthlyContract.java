package Task03;

public class monthlyContract extends Worker implements Wage,Vacation{
    public monthlyContract() {
        String workingTime3= this.workingTime;
        int workingDays3 = this.workingDays;
        int baseWage3 = this.baseWage;
    }
    @Override
    public double yearlyWage()
    {
        return baseWage * 12;
    }
    @Override
    public double yearlyVacation()
    {
        return 21;
    }
}
