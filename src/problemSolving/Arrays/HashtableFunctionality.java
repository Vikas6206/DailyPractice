package problemSolving.Arrays;

import java.util.*;

/**
 * HashTable is the synchronized
 * NULL is not allowed i.e. neither key nor value can be null
 * UnSorted and Unordered data
 */
public class HashtableFunctionality {
    public static void main(String args[]) {
        Hashtable<Integer, String> hashtable = new Hashtable<>();

        //put element to the hash table
        hashtable.put(1, "Vikas");
        hashtable.put(2, "Kumar"); //duplicate value
        hashtable.put(3, "Vineet");
        hashtable.put(4, "Kumar6"); //duplicate value
        hashtable.put(5, "Vivek");
        hashtable.put(5, "Kumar1");

        Set<Map.Entry<Integer, String>> entries = hashtable.entrySet();

        System.out.println("First way to loop via using the enhanced for loop");
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


        System.out.println("Second way to loop via iterator");
        Iterator<Map.Entry<Integer, String>> iterator = entries.iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println("Third way to loop via Java8 entry set");

        entries.forEach((entry) ->
                System.out.println(entry.getKey() + " " + entry.getValue()));

        System.out.println("Fourth way to loop via Java8 hashtable directly");
        hashtable.forEach((k, v) -> System.out.println(k + " " + v));



        //TODO: important
        //Sort the hashtable based on value
        List<Map.Entry<Integer, String>> sortedList = new ArrayList<>(entries);


        Collections.sort(sortedList, new Comparator<Map.Entry<Integer, String>>() {

            @Override
            public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

//        Collections.sort(sortedList, (o1, o2) -> o1.getValue().compareTo(o2.getValue()));
//        Collections.sort(sortedList, Comparator.comparing(Map.Entry::getValue));
        System.out.println(sortedList);

        //remove element based on value
//        hashtable.values().remove("value")
//        hashtable.remove(key)
        String valueToBeRemoved="Kumar6";
        Iterator<Map.Entry<Integer, String>> itr = entries.iterator();
        while (itr.hasNext()){
            if(valueToBeRemoved.equals(itr.next().getValue())){
                itr.remove();
            }
        }
        System.out.println(hashtable);

    }
}
