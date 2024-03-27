
package ISPViolation01test;

import ISPViolation01.BasicPrinter;
import ISPViolation01.MultiFunctionPrinter;
import ISPViolation01.Document;
import org.testng.annotations.Test;

import org.junit.jupiter.api.Assertions.*;

import javax.print.Doc;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ISPViolation01test {
    @Test
    public void TestPrinter01(){
        BasicPrinter basicPrinter = new BasicPrinter();
        Document document = new Document("This is basic printer");
        basicPrinter.Print(document);


    }

    @Test
    public void TestPrinter02(){

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();

        Document document = new Document("This is Multi Printer");

        multiFunctionPrinter.Print(document);



    }

    @Test
    public void TestPrinter03(){

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();
        multiFunctionPrinter.Print(multiFunctionPrinter.scan());



    }
    @Test
    public void TestPrinter04(){

        MultiFunctionPrinter multiFunctionPrinter = new MultiFunctionPrinter();

        Document document = new Document("This is Multi Printer");

        multiFunctionPrinter.Fax(document);



    }

}
