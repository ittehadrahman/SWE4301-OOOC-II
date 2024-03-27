import Task01.DevelopmentHistory;
import Task01.DevelopmentHistoryWithReviewer;
import Task01.Faculty;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


public class FacultyTest {

    @Test
    public void methodTest()
    {
        Object faculty=new Faculty("Sami","Faculty",1000000);
        Method[] methods=faculty.getClass().getDeclaredMethods();
        List<String> actualMedthodNames=new ArrayList<>();
        for(Method m:methods)
        {
            System.out.println(m.getName());
            boolean annotationPresent=m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationPresent){
                System.out.println(m.getDeclaredAnnotations().length);
                actualMedthodNames.add(m.getName());
            }
        }
        assertTrue(Arrays.asList("research", "teach").containsAll(actualMedthodNames));
    }

    @Test
    public void methodTest2()
    {
        Object faculty=new Faculty("Sami","Student",1000000);
        Method[] methods=faculty.getClass().getDeclaredMethods();
        List<String> actualMedthodNames=new ArrayList<>();
        for(Method m:methods)
        {
            System.out.println(m.getName());
            boolean annotationPresent=m.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationPresent){
                System.out.println(m.getDeclaredAnnotations().length);
                actualMedthodNames.add(m.getName());
            }
        }
        assertFalse(Arrays.asList("teach").containsAll(actualMedthodNames));
    }
    @Test
    public void constructorTest()
    {
        Object faculty=new Faculty("Sami","Student",1000000);
        Constructor<?>[] constructors=faculty.getClass().getDeclaredConstructors();
        List<String> actualConstructorNames=new ArrayList<>();
        for(Constructor c:constructors)
        {
            System.out.println(c.getName());
            System.out.println(c.getDeclaredAnnotations().length);
            boolean annotationPresent=c.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
            if(annotationPresent){
                System.out.println(c.getDeclaredAnnotations().length);
                actualConstructorNames.add(c.getName());
            }
        }
        for (String s:actualConstructorNames)
        {
            System.out.println(s);
        }
        assertTrue(Arrays.asList("Task01.Faculty").containsAll(actualConstructorNames));
    }
    @Test
    public void classTest()
    {
        Object faculty=new Faculty("Sami","Student",1000000);
        Class<?> classes=faculty.getClass();
        List<String> actualClassNames=new ArrayList<>();

        System.out.println(classes.getName());
        boolean annotationPresent=classes.isAnnotationPresent(DevelopmentHistoryWithReviewer.class);
        if(annotationPresent){
            System.out.println(classes.getDeclaredAnnotations().length);
            actualClassNames.add(classes.getName());

        }
        assertTrue(Arrays.asList("Faculty").containsAll(actualClassNames));
    }


}
