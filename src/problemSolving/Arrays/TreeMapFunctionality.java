package problemSolving.Arrays;

import java.util.*;

/**
 * NULL is not allowed in key
 */
public class TreeMapFunctionality {
    public static void main(String args[]) {
        //we can sort only based on the key on the key
        //if key is String/Integer then it is sorted based on lexcal ordering
//        Comparator would work
        TreeMap<Index,String> items = new TreeMap<>(new Comparator<Index>() {
            @Override
            public int compare(Index o1, Index o2) {
                return o1.x.compareTo(o2.x);
                //to get in reverse order o2.x.compareTo(o1.x)
//                return  o2.x.compareTo(o1.x);
            }
        });
        items.put(new Index(2),"Rice");
        items.put(new Index(1),"Dal");
        items.put(new Index(7), "null");
        items.put(new Index(4),null);
        items.put(new Index(9), "ssds"); //the 2nd null over-rides the previous entry of null in the HashMap

        Set<Map.Entry<Index,String>> entries = items.entrySet();
        entries.forEach(entry ->System.out.println(entry.getKey()+" "+entry.getValue()));

    }
}

class Index{
    Integer x;

    public Index(Integer x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "Index{" +
                "x=" + x +
                '}';
    }
}
