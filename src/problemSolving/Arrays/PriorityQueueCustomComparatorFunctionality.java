package problemSolving.Arrays;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueCustomComparatorFunctionality {

    public static void main(String args[]) {
        PriorityQueueComparator priorityQueueComparator = new PriorityQueueComparator();
        PriorityQueue<String> priorityQueue = new PriorityQueue(priorityQueueComparator);
        priorityQueue.add("Aaaaana");
        priorityQueue.add("Aaaaanaaaaa");
        priorityQueue.add("AABS");

        for (String i : priorityQueue) {
            System.out.println("Priority Queue element value is " + i);
        }
    }
}

class PriorityQueueComparator implements Comparator<String> {
    @Override
    public int compare(String s1, String s2) {
        if (s1.toLowerCase().length() < s2.toLowerCase().length()) {
            return -1;
        }

        if (s1.toLowerCase().length() > s2.toLowerCase().length()) {
            return 1;
        }
        return 0;
    }
}
