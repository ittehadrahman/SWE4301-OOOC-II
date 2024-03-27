package Task01;

import java.util.ArrayList;
import java.util.List;

public class ResultPublication {

    public void PublishResult(List<Student> students, Ipublish ipublish) {
        ipublish.publish(students);
    }
}
