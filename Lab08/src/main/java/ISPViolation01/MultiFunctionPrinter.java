package ISPViolation01;

import javax.print.Doc;
import java.util.Scanner;

public class MultiFunctionPrinter implements IMultiFunctionPrinter{

    @Override
    public void Print(Document document){
        System.out.println(document.getText());
    }

    @Override
    public Document scan(){
        Scanner input = new Scanner(System.in);
        String string = input.nextLine();
        Document document = new Document(string);
        return document;

    }

    @Override
    public void Fax(Document document){
        System.out.println(document.getText() + " (faxed)");
    }
}
