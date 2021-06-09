package problemSolving.Arrays;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueFunctionality {
    /**
     * Elements are arranged in natural ordering or by Comparator provided at Queue construction time
     * It doesn't permitt null element
     *
     * @param args
     */

    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("nibba");
        priorityQueue.add("nibbi");
        priorityQueue.add("answer");
        priorityQueue.add("question");

        System.out.println("Elements are arranged in natural ordering .....");

        for (String s : priorityQueue) {
            System.out.println("Priority queue element :" + s);
        }

        System.out.println("Remove the first element from top and won't throw exception if pq is empty");
        priorityQueue.poll();

        for (String s : priorityQueue) {
            System.out.println("Priority queue element :" + s);
        }
        System.out.println("Remove the first element from top and will throw exception if pq is empty");
        priorityQueue.remove();

        for (String s : priorityQueue) {
            System.out.println("Priority queue element :" + s);
        }
    }
}
