package sortingAlgorithm;

public class InsertionSort {
    //TODO: At the end of each pass the element on the left side of the array would
    // become sorted i.e. we will take the first element as sorted and form the second element
    // we will comapare and swap the elements with the left elements untill all the elements become sorted

    public static void main(String args[]){
        int array[]={5,4,7,2,9,1,6,8};
        System.out.println("Array element are as follows");
        for(int i:array){
            System.out.print(i+" ");
        }
        insertionSort(array);

        System.out.println();
        System.out.println("Sorted array element are as follows");
        for(int i:array){
            System.out.print(i+" ");
        }
    }

    private static void insertionSort(int[] array) {
        for(int i=1;i<array.length;i++){
            for(int j=i;j>0;j--){
                if(array[j]<array[j-1]){
                    //swap the elements
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                }
            }
            System.out.println("After pass :"+ i);
            for (int j:array){
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
}
