package searching;

import java.util.Arrays;

/**
 * The pre-requsite for the binary search is that all the
 * elelments are sorted and non of the element should be repeated
 */
public class BinarySearchRecursion {

    public static void main(String args[]) {
        int key = 10;
        int array[] = {2, 4, 6, 8, 10, 10, 14, 16, 18};
        System.out.println("Given array element is ...");
        Arrays.stream(array).forEach(value -> System.out.print(value + " "));
        System.out.println(" ");
        System.out.println("Element to be searched is " + key);
        boolean elementFound = binarySearchOfElement(array, key, 0, array.length - 1);
        System.out.println("Element " + key + " found? " + elementFound);
    }

    private static boolean binarySearchOfElement(int[] array, int key, int low, int high) {
        if (low > high) {
            return false;
        }

        int mid = low + ((high - low) / 2);
        if (key == array[mid]) {
            return true;
        } else if (key < array[mid]) {
            return binarySearchOfElement(array, key, low, mid - 1);
        } else {
            return binarySearchOfElement(array, key, mid + 1, high);
        }
    }
}
