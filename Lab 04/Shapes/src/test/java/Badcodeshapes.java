public class Badcodeshapes {
    public void Circle()
    {
        System.out.println("This is a circle!");
    }
    public void Rectangle()
    {
        System.out.println("This is a rectangle!");
    }
    public void drawshape(String s)
    {
        if(s == "Circle")
        {
            Circle();
        }
        else if(s == "Rectangle")
        {
            Rectangle();
        }
    }
}
