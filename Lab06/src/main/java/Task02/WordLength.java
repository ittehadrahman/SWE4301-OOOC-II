package Task02;

public class WordLength implements SpecialNumber<String>
{
    @Override
    public boolean match(String t)
    {
        if(t.length()>4)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
