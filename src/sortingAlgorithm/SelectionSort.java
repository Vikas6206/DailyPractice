package sortingAlgorithm;

public class SelectionSort {
    //TODO: At end of each pass SMALLEST NUMBER IS SORTED based on position logic i.e.
    // smallest number is placed at the starting. Time complexity avg/worse case is O(n2)
    //  find the smalest element from i+1 to n and replace the element value with i=0

    public static void main(String args[]) {
        int array[] = {1, 5, 2, 9, 5, 8, 7};
        System.out.println("Array elements :");
        for (int i : array) {
            System.out.println(i);
        }
        selectionSort(array);

        System.out.println("Sorted array elements are :");
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int smallPos = i;
            for (int j = i + 1; j < array.length - 1; j++) {
                if (array[j] < array[j + 1]) {
                    smallPos = j;
                }
            }
            //Got the smallest element from the remaining array element
            //compare it with the first element and if first element is larger than the smallest element swap
            // so that in this pass we get the smallest element in the front
            if (array[i] > array[smallPos]) {
                int temp = array[i];
                array[i] = array[smallPos];
                array[smallPos] = temp;
            }
        }
    }
}
