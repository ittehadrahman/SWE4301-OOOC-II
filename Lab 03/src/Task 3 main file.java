import java.util.Date;
import java.util.Scanner;
import java.util.*;
public class Exception {
    public static void main(String[] args)
    {
        int check = 0;
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        ExceptionHandling eh = new ExceptionHandling();
        for(int i=0;i<name.length();i++)
        {
            if(name.indexOf('_')==0)
            {
                check = 1;
            }
        }
        eh.EH(check);

    }
}
