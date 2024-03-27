package ISPViolation01;

import javax.print.Doc;

public class Document {
    private String string="";
    public Document(String str)
    {
        this.string=str;
    }

    public String getText() {
        return this.string;
    }

    public void setText(String string) {
        this.string = string;
    }
}
