package problemSolving.Arrays;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * HashMap is the not-synchronized
 * NULL is  allowed i.e. 1 key can be null and multiple values can be null
 * UnSorted and Unordered data
 */
public class HashMapFunctionality {

    public static void main(String args[]) {
        Map<String, Integer> items = new HashMap<>();
        items.put("Rice", 1);
        items.put("Dal", 2);
        items.put(null, 1);
        items.put("biryani", null);
        items.put(null, 3); //the 2nd null over-rides the previous entry of null in the HashMap

        Set<Map.Entry<String, Integer>> entries = items.entrySet();
        entries.forEach(entry ->System.out.println(entry.getKey()+" "+entry.getValue()));

    }
}
