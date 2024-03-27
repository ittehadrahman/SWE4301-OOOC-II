package lab5.task1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    void Fizz()
    {
        fizzBuzz fizzBuzz = new fizzBuzz();
        assertEquals("Fizz", fizzBuzz.getFizzyBuzz(3));
    }
    @Test
    void Buzz()
    {
        fizzBuzz fizzBuzz = new fizzBuzz();
        assertEquals("Buzz", fizzBuzz.getFizzyBuzz(7));
    }
    @Test
    void Fizzbuzz()
    {
        fizzBuzz fizzBuzz = new fizzBuzz();
        assertEquals("Fizzbuzz", fizzBuzz.getFizzyBuzz(21));
    }
    @Test
    void Gotcha()
    {
        fizzBuzz fizzBuzz = new fizzBuzz();
        assertEquals("Gotcha", fizzBuzz.getFizzyBuzz(4));
    }
}
