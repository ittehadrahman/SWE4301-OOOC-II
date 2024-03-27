import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

import static java.lang.System.out;

public class EmployeeDB {
    List<Employee> employees;
    Employee emp = new Employee("Sami");
    public void save(Employee employee) {
        FileWriter fw = null;
        try {
            fw = new FileWriter(" myfile.txt ", true);
            fw.write(employee.toString() + "\n");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // this code will give error if there is no file
    public void anotherSave() {
        try {
            Files.write(Paths.get(" myfile . txt "), " the text ".getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Employee> add(List<Employee> employees, Employee employee) {
        employees.add(employee);
        return employees;
    }

    public void get() {
        List<Employee> employeeList = new ArrayList<>();
        FileReader fr = null;
        StringBuilder sb = null;
        try {
            fr = new FileReader("myfile.txt");
            BufferedReader br = new BufferedReader(fr);
            sb = new StringBuilder();
            String line;
            while ((line=br.readLine()) != null) {
                sb.append(line);
                sb.append("\n");
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try
            {
                fr.close();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
        }
        out.println(sb);
        objectConversion(sb);
    }
    private void objectConversion(StringBuilder sb)
    {
        String[] split = sb.toString().split("\n");
        for(String s: split)
        {
            String split1 = String.valueOf(s.split(","));
        }
    }

    public List<Employee> ageFilter(int age) {
        return employees.stream()
                .filter(e -> e.getAge()>age)
                .collect(Collectors.toList());
    }
    public List<Employee> salaryFilter(int salary) {
        return employees.stream()
                .filter(e -> e.getSalary()>salary)
                .collect(Collectors.toList());
    }
}
