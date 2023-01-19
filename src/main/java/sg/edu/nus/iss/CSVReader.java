package sg.edu.nus.iss;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

    public static final String COMMA_DELIMITER = ",";
    public static final String NEWLINE_SEPARATOR = "\n";

    public List<Employee> readfromCSV(File f) throws IOException {

        String input = "";
        String[] inputArr = null;
        boolean eof = false;
        List<Employee> employees = new ArrayList<>();

        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);

        while (!eof) {
            try {
                input = br.readLine();
                // System.out.println(input);

                if (input == null) {
                    eof = true;
                    continue;
                }else{

                    inputArr = input.trim().split(COMMA_DELIMITER);
                    if (inputArr[0].equals("staffNo")) {
                        continue;
                    } else {
                        Employee e = new Employee(inputArr[0], inputArr[1], inputArr[2], inputArr[3], inputArr[4],
                                Integer.parseInt(inputArr[5]));
                        employees.add(e);
                    }
    
                }
                
            } catch (EOFException ex) {
                eof = true;
            }
        }

        br.close();
        fr.close();

        return employees;
    }

}
