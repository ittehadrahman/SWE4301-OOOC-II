package Task03;

public class Worker implements Wage,Vacation{
    public int workingDays;
    public String workingTime;
    public int baseWage;

    public Worker(String workingTime, int baseWage, int workingDays)
    {
        this.baseWage = baseWage;
        this.workingTime = workingTime;
        this.workingDays = workingDays;
    }

    public Worker() {
        this.baseWage = baseWage;
        this.workingTime = workingTime;
        this.workingDays = workingDays;
    }


    @Override
    public double yearlyVacation()
    {
        return 21;
    }

    @Override
    public double yearlyWage()
    {
        return 12 * (workingDays * baseWage/25);
    }
}
