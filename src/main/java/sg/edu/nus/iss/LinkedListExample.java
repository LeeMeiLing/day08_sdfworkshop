package sg.edu.nus.iss;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    
    public static void example(){

        List<String> ll = new LinkedList<>();

        ll.add("A");
        ll.add("B");
        ll.add("C");
        ll.add("D");
        ll.add("E");
        ll.add("F");
        ll.add("G");

        ll.forEach(itm -> System.out.println(itm));

        ll.remove("C");
        System.out.println(ll);

        ll.remove(5);
        System.out.println(ll);


        // removeFirst() & removeLast() only available for LinkedList but not available for type List
        // therefore casting is required as ll is type List 
        ((LinkedList<String>)ll).removeFirst();
        System.out.println(ll);

        ((LinkedList<String>)ll).removeLast();
        System.out.println(ll);

    }
    

    


}
