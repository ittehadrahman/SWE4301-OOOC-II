package Task02;
import java.util.List;

public class Algorithm 
{
    public <T> int countIf(List<T> list, SpecialNumber<T> specialNumber)
    {
        int count = 0;
        for (T type : list)
        {
            if (specialNumber.match(type))
            {
                ++count;
            }
        }
        return count;
    }
}

