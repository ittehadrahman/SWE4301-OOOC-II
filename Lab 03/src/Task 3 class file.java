public class ExceptionHandling {
    public void EH(int check)
    {
        try{
            if(check == 1)
            {
                System.out.println("Ok");
            }
        }
        catch(ArithmeticException e){
            if(check == 0)
            {
                System.out.println("Not Ok");
            }
        }
    }
}
