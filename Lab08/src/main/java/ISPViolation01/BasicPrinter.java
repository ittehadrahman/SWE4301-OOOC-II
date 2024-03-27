package ISPViolation01;

import javax.print.Doc;

public class BasicPrinter implements Print{

    @Override
    public void Print(Document document) {
        System.out.println(document.getText());
    }
}
