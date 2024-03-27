public class Direction {
    public void Direction(String s)
    {
        if(s.compareTo("North") == 0)
        {
            System.out.println("I am in the North");
            System.out.println("I have to go to South");
        }
        if(s.compareTo("South") == 0)
        {
            System.out.println("I am in the South");
            System.out.println("I have to go to North");
        }
        if(s.compareTo("West") == 0)
        {
            System.out.println("I am in the West");
            System.out.println("I have to go to East");
        }
        if(s.compareTo("East") == 0)
        {
            System.out.println("I am in the East");
            System.out.println("I have to go to West");
        }
    }
}
