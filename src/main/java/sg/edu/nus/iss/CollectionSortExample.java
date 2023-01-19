package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionSortExample {
    
    public static void example01(){

        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i < 10; i++){
            numbers.add((int) (Math.random() * 100));
        }

        System.out.println("Unsorted list: " + numbers);

        //////Using Collections.sort()/////////
        // sort in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Reverse sorted list: " + numbers);

        ////Using Comparator.reverseOrder to sort
        numbers.sort(Comparator.reverseOrder());
        System.out.println("Reverse sorted list using comparator: " + numbers);
    }

    public static void example02(){

        Employee emp1 = new Employee("12345", "Darryl Ng", "SS", "Lecturer", "darryl@email.com", 20000);
        Employee emp2 = new Employee("23456", "Dennis Leong", "SS", "Lecturer", "dennis@email.com", 15000);
        Employee emp3 = new Employee("34567", "Dendon Ong", "SS", "Lecturer", "dendon@email.com", 25000);
        
        List<Employee> employees = new ArrayList<>();
        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);

        System.out.println("Unsorted employee list: ");
        System.out.println(employees + "\n");

        // ascending order sortusing Collections.sort()
        Collections.sort(employees);
        System.out.println("Sorted employee list: ");
        System.out.println(employees+ "\n");

        // sorting using Comparator.comparing() and lambda
        employees.sort(Comparator.comparing(e -> e.getSalary()));
        System.out.println("Sorted employee list by salary: ");
        System.out.println(employees + "\n");


    }
}
