package Task01;

import java.util.List;

public class ExportToCSV implements IExport{

    @Override
    public String ListExport(List<Student> students) {
        return "Export to CSV file!";
    }
}
