import java.util.Date;
import java.util.Scanner;
import java.util.*;
public class GoTo {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        Direction direction = new Direction();
        direction.Direction(name);
    }
}
