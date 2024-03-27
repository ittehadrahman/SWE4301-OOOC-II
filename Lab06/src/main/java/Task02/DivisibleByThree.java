package Task02;

public class DivisibleByThree implements SpecialNumber<Integer>{
    @Override
    public boolean match(Integer t)
    {
        return (t % 3==0);
    }
}
