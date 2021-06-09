package problemSolving.Arrays;

import java.util.LinkedList;

public class LinkedListFunctionality {
    public static void main(String args[]){
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("a");
        linkedList.add("s");
        linkedList.add("g");
        linkedList.add("q");
        linkedList.add("p");
        linkedList.add("edf");
        linkedList.add("hyft");

        for(String s: linkedList){
            System.out.println("Linkedlist element "+s);
        }

        System.out.println("Add element to first and last");
        linkedList.addFirst("FirstElement");
        linkedList.addLast("LastElement");

        for(String s: linkedList){
            System.out.println("Linkedlist element after adding first and last element :"+s);
        }

        System.out.println("Update the first element by reading the index");
        Object object1=linkedList.get(0);
        linkedList.set(0,(String) object1);

        for(String s: linkedList){
            System.out.println("Linkedlist element :"+s);
        }

        System.out.println("Remove the  element by index 4");
        linkedList.remove(4);

        for(String s: linkedList){
            System.out.println("Linkedlist element :"+s);
        }

        System.out.println("Peek for the first element :"+linkedList.peek());

        System.out.println("Offer i.e. adds the element at the last of the list :"+linkedList.offer("NewLast"));

        for(String s: linkedList){
            System.out.println("Linkedlist element :"+s);
        }

        System.out.println("Remove element to first and last :");
        linkedList.removeFirst();
        linkedList.removeLast();

        //we can even remove based on the index
        for(String s: linkedList){
            System.out.println("Linkedlist element :"+s);
        }

        System.out.println("Element removed from the first element added to list FIFO  :"+linkedList.pop());


    }
}
