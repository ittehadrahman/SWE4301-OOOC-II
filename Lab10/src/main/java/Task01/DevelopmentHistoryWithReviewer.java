package Task01;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
public @interface DevelopmentHistoryWithReviewer
{
    DevelopmentHistory developmentHistory();
    String[] reviewer() default "{}";
}
