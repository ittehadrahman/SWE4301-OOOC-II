package SRPViolation01;

import java.util.ArrayList;
import java.util.List;

public class Journal {
    public ArrayList<String> entries = new ArrayList<>();
    JournalDB database = new JournalDB();
    public void addEntry(String entry)
    {
        entries.add(entry);
    }
    public void addEntries(ArrayList<String> strings)
    {
        for(String string: strings)
        {
            entries.add(string);
        }
    }
    public void removeEntry(String removeString)
    {
        for(String entry: entries)
        {
            if(entry.equals(removeString))
            {
                entries.remove(entry);
            }
        }
    }


}
