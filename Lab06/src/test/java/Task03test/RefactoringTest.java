package Task03test;
import Task03.Worker;
import Task03.Permanent;
import Task03.dayLabor;
import Task03.monthlyContract;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class RefactoringTest {
    @Test
    void permanent()
    {
        Permanent permanent = new Permanent();
        permanent.baseWage = 1000;
        permanent.workingDays = 300;
        assertEquals(39600, permanent.yearlyWage());
        assertEquals(29, permanent.yearlyVacation());
    }
    @Test
    void dayLabor()
    {
        dayLabor daylabor = new dayLabor();
        daylabor.baseWage = 1000;
        daylabor.workingDays = 300;
        assertEquals(144000, daylabor.yearlyWage());
        assertEquals(0, daylabor.yearlyVacation());
    }
    @Test
    void monthlyContract()
    {
        monthlyContract MonthlyContract = new monthlyContract();
        MonthlyContract.baseWage = 1000;
        MonthlyContract.workingDays = 300;
        assertEquals(12000, MonthlyContract.yearlyWage());
        assertEquals(21, MonthlyContract.yearlyVacation());
    }
    @Test
    void instance()
    {
        Permanent permanent = new Permanent();
        Worker worker = new Worker();
        assertInstanceOf(Permanent.class, worker.getClass());
    }
}
