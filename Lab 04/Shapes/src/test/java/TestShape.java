import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TestShape {
    @Test
    public void TestShape()
    {
        List<Shape> shapes = Arrays.asList(
                new Circle(),
                new Rectangle(),
                new Circle()

        );
        for(Shape shape: shapes)
        {
            shape.draw();
            assertTrue(shape instanceof Shape);
        }
    }
    @Test
    public void TestsShape()
    {
        List<Shape> shapes = Arrays.asList(
                new Circle(),
                new Rectangle(),
                new Circle(),
                new Triangle()
                );
        for(Shape shape: shapes)
        {
            shape.draw();
            assertTrue(shape instanceof Shape);
        }
    }
}
