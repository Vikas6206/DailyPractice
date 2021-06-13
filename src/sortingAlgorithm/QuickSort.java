package sortingAlgorithm;

public class QuickSort {
    //TODO: Choose the pivot element i.e. the middle element from array
    // Find the position of the pivot element to be placed in the array and swap that element with the pivot element

    public static void main(String args[]) {

        int array[] = {2, 6, 3, 7, 1, 9, 5, 6};
        System.out.println("Array length is :"+array.length);
        quickSort(array, 0, array.length - 1);
        System.out.println("Sorted element is :");
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    private static void quickSort(int[] array, int low, int high) {
        if (low < high) {
            //find the position of the pivot element
            int j = position(array, low, high);
            quickSort(array, low, j-1);
            quickSort(array, j + 1, high);
        }
    }

    private static int position(int[] array, int low, int high) {

        int pivot = array[high];
        int i = low-1; //index of the lowest element
       for(int j=low;j<high;j++){

            if(array[j]<=pivot){
                i++;
                //swap arr(j,i)
                int temp=array[i];
                array[i]=array[j];
                array[j]=temp;
            }
        }
        //swap the pivot i.e. array[high] with the lowest elemnt
        int temp = array[i+1];
        array[i+1] = array[high];
        array[high] = temp;
        return i+1;
    }
}
