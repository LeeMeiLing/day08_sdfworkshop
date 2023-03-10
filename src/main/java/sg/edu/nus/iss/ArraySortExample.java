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

    public static void example02(){

        Integer[] numbers = {2,4,6,8,10,3,5,7};
        int[] numbers2 = {2,4,6,8,10,3,5,7};

        System.out.println("Unsorted array number: " + Arrays.toString(numbers));
        System.out.println("Unsorted array numbers2: " + Arrays.toString(numbers2));

        //sort the array in ascending order
        Arrays.sort(numbers);
        System.out.println("Sorted array number: " + Arrays.toString(numbers));
        Arrays.sort(numbers2);
        System.out.println("Sorted array numbers2: " + Arrays.toString(numbers2));


        //sort the array in descending order
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println("Reverse sorted array number: " + Arrays.toString(numbers));
        // Arrays.sort(numbers2, Collections.reverseOrder());
        // System.out.println("Reverse sorted array numbers2: " + Arrays.toString(numbers2));

    }


}
