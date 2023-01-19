package sg.edu.nus.iss;

import java.util.Arrays;
import java.util.Collections;

public class ArraySortExample {
    
    public static void example(){

        String[] name = {"darryl","elaine","james","zoanne","chris","mark",
        "sophia","asher","brandon","helen","daniel","marcus"};

        System.out.println("Unsorted array: " + Arrays.toString(name));

        //sort the array in ascending order
        Arrays.sort(name);
        System.out.println("Sorted array: " + Arrays.toString(name));

        //sort the array in descending order
        Arrays.sort(name, Collections.reverseOrder());
        System.out.println("Reverse sorted array: " + Arrays.toString(name));
    }
}
