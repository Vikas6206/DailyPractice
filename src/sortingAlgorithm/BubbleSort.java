package sortingAlgorithm;

public class BubbleSort {
    /**
     * elements are sorted out in each pass, there are k passes made to get all
     * the sorted element. Worst case & average case time complexity is O(n2) which makes it
     * im-practical for sorting
     */

    //TODO: At end of each pass LARGEST NUMBER IS SORTED
    /**
     * At the end of each pass the next largest elements moves to its correct position i.e. at the end of the array
     * @param args
     */
    public static void main(String args[]){
        int array[]={6,8,1,9,12,7,35};

        System.out.println("Array element are as follows");
        for(int i:array){
            System.out.println(i);
        }
        bubbleSort(array);

        System.out.println("Sorted array element are as follows");
        for(int i:array){
            System.out.println(i);
        }
    }

    private static void bubbleSort(int[] array) {
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-1;j++){
                if(array[j]>array[j+1]){
                    //swawp the elemnts
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            System.out.println("After pass :"+ (i+1));
            for (int j:array){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
