package Task02test;

import java.util.Arrays;
import java.util.List;

import Task02.Algorithm;
import Task02.DivisibleByThree;
import Task02.OddNumber;
import Task02.WordLength;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {
    @Test
    public void oddNumber()
    {
        List<Integer> list = Arrays.asList(2,3,16,6);
        OddNumber odd_number = new OddNumber();
        Algorithm a = new Algorithm();
        assertEquals(1, a.countIf(list,odd_number));
    }
    @Test
    public void DivisibleByThree()
    {
        List<Integer> list = Arrays.asList(2,3,5,6);
        DivisibleByThree divisibleByThree = new DivisibleByThree();
        Algorithm a = new Algorithm();
        assertEquals(2, a.countIf(list,divisibleByThree));
    }
    @Test
    public void WordLength()
    {
        WordLength wordLength = new WordLength();
        List<String> list = Arrays.asList("Alice","Bob","Beautiful");
        Algorithm a = new Algorithm();
        assertEquals(2, a.countIf(list, wordLength));
    }


}
