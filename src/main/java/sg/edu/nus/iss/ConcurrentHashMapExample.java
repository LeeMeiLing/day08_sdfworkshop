package sg.edu.nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    
    public static void example(){

        Map<String, Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Acer",5);
        laptops.put("Apple",100);
        laptops.put("MSI",10);
        laptops.put("Asus",15);

        System.out.println("Total laptops: " + laptops.size());

        for (String key: laptops.keySet()){
            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "Asus";
        if(laptops.containsKey(searchString)){
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        Enumeration<Integer> elements = ((ConcurrentHashMap<String, Integer>)laptops).elements();
        while(elements.hasMoreElements()){
            System.out.println(elements.nextElement());
        }

        // putIfAbsent return the value if key already exist
        // putIfAbsent return null if key not exist and add the key-value pair into the map
        System.out.println(laptops.putIfAbsent("Apple", 25));
        System.out.println(laptops.putIfAbsent("Aftershock", 12));
        System.out.println(laptops.get("Aftershock"));

    }
}
