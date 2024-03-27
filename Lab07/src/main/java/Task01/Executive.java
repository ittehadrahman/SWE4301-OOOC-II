package Task01;

public class Executive implements IMastersProgram{
    String major;
    public Executive(String major)
    {
        this.major = major;
    }

    @Override
    public boolean isEligible(float cgpa, String major) {
        return false;
    }

    @Override
    public int getMarks(int theoryMarks, int thesisMarks, int projectMarks) {
        return 0;
    }
}
