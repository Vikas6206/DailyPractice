package INterview;

import java.util.*;

public class WindowHandle {
    public static void main(String args[]) {
        Set<String> dataSet = new HashSet<>();
        dataSet.add("One");
        dataSet.add("Three");
        dataSet.add("Zero");
        dataSet.add("Pankaj");

        Iterator<String> iterator = dataSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(2);



    }
}
