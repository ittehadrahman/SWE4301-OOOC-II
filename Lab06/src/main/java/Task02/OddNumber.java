package Task02;

public class OddNumber implements SpecialNumber<Integer>
{

    @Override
    public boolean match(Integer t)
    {
        return (t % 2 != 0);
    }
}
