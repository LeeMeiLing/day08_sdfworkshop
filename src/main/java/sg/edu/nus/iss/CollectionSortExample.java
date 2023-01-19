package sg.edu.nus.iss;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionSortExample {
    
    public static void example01(){

        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i < 10; i++){
            numbers.add((int) (Math.random() * 100));
        }

        System.out.println("Unsorted list: " + numbers);

        // sort in ascending order
        Collections.sort(numbers);
        System.out.println("Sorted list: " + numbers);

        // sort in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Reverse sorted list: " + numbers);
            

    }
}
