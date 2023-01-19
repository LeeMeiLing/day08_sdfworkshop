package sg.edu.nus.iss;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVWriter {
    
    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";
    private static final String FILE_HEADER = "staffNo,fullName,department,role,emailAddress,salary";
    public List<Employee> employees = null;

    public List<Employee> generateEmployees(){

        employees = new ArrayList<>();

        // create some employees
        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer", "darryl@email.com", 20000);
        Employee emp2 = new Employee("23456", "Dennis Leong", "SS", "Lecturer", "dennis@email.com", 15000);
        Employee emp3 = new Employee("34567", "Dendon Ong", "SS", "Lecturer", "dendon@email.com", 25000);

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        return employees;

    }

    public void writeToCSV(List<Employee> employees, String fileName) throws IOException{

        FileWriter fw = new FileWriter(fileName);
        fw.append(FILE_HEADER); // fw.append(FILE_HEADER.toString());
        fw.append(NEWLINE_SEPARATOR);

        // read recordsrow by row and write it using fw.append
        for(Employee e : employees){

            fw.append(e.getStaffNo());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getFullName());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getDepartment());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getRole());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getEmailAddress());
            fw.append(COMMA_DELIMITER);
            fw.append(e.getSalary().toString()); //    fw.append(String.valueOf(e.getSalary()));
            fw.append(NEWLINE_SEPARATOR);

        }

        fw.flush();
        fw.close();

    }


}
