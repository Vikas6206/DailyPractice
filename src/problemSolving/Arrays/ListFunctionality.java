package problemSolving.Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ListFunctionality {
    public static void main(String args[]) {
        // add element to a list
        ArrayList<Integer> elements = new ArrayList<>();
        elements.add(2);
        elements.add(4);
        elements.add(6);
        elements.add(8);
        elements.add(12);

        //display the elements using for each
        for (Integer i : elements) {
            System.out.println("The elements are as follows " + i);
        }


        System.out.println("The size of the array element is " + elements.size());

        System.out.println(" index of element by value " + elements.lastIndexOf(8));

        System.out.println("Remove element from the list ");
        elements.remove((Integer) 6);

        for (int i = 0; i < elements.size(); i++) {
            System.out.println("Elements are " + elements.get(i));
        }

        System.out.println("Extract sublist from given list based on position 1,3 :");

        List<Integer> subList = elements.subList(1, 3);
        for (Integer j : subList) {
            System.out.println("sublist elements are " + j);
        }

        System.out.println("Add the newly created sub list to the existing list :");
        elements.addAll(subList);

        for (Integer k : elements) {
            System.out.println("Newly updated list elements are " + k);
        }

        System.out.println("Convert the list to array or vice versa :");
        Integer intArray[] = {};
        intArray = elements.toArray(intArray);

        for (Integer l : intArray) {
            System.out.println("Value of integer array " + l);
        }


        System.out.println("Sort the list collection :");
        Collections.sort(elements);
        for (Integer m : elements) {
            System.out.println("Sorted list elements are " + m);
        }
        System.out.println("Maximum element is :"+ Collections.max(elements));


        System.out.println("Iterating collection via iterator :");
        Iterator<Integer> it=elements.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("3 WAYS TO ITERATE ARRAY LIST I.E. for each loop, for loop and iterator()");
    }
}
