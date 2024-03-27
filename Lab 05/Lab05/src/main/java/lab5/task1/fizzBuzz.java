package lab5.task1;

class fizzBuzz
{
    public String getFizzyBuzz(int n){
        if (n % 3 == 0)
        {
            if (n % 7 == 0)
            {
                return "Fizzbuzz";
            }
            else {
                return "Fizz";
            }
        }
        if (n % 7 == 0)
        {
            return "Buzz";
        }
        else
        {
            return "Gotcha";
        }
    }
}
