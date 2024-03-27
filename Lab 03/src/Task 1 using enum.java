import java.util.Date;
import java.util.Scanner;
import java.util.*;

enum code{
    C_400("Bad Request"),
    C_401("Unauthorized"),
    C_403("Forbidden"),
    C_404("Not Found"),
    C_408("Request Timeout");
    private String c;

    public String getInfo()
    {
        return c;
    }
    private code(String c)
    {
        this.c = c;
    }
}

public class Solution2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        code[] codes = code.values();
        for(code code: codes )
        {
            if(code.compareTo(name)==0)
            {


            }
        }
    }
}
