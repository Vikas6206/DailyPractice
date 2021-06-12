package searching;

import java.util.Arrays;

/**
 * Time complexity is O(log to base 2 n), where n is the number of element
 */
public class BinarySearchNormal {

    public static void main(String args[]) {
        int array[] = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 7;

        System.out.println("Given array element is ...");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));
        System.out.println(" ");
        System.out.println("Element to be searched is " + key);
        boolean flag = binarySearch(array, key);
        System.out.println("Element " + key + " found? " + flag);
    }

    private static boolean binarySearch(int[] array, int key) {
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int mid = low + ((high - low) / 2);

            if (key == array[mid]) {
                return true;
            } else if (key < array[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }
        return false;
    }
}
