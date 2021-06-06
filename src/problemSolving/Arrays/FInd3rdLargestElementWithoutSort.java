package problemSolving.Arrays;

public class FInd3rdLargestElementWithoutSort {

    public static void main(String str[]){
        int arr[]={3,17,19,4,7,23,87};

        //make a temp array to store the result
        int temp[]= new int[3];

        //loop over the temp array & input array and store teh result in the temp array
        for(int i=0;i<3;i++){
            int pos=0;
            int highestVal=0;
            for(int j=0;j<arr.length;j++){
                //grab the largest element in each swap
                if(arr[j]>highestVal){
                    highestVal=arr[j];
                   pos=j;
                }
            }
            //currentVal contain the largest element and thus store it in the array
            temp[i]=highestVal;
            //swap the value in the jth or pos  position with the value of arr[i]
            arr[pos]=arr[i];

            System.out.println(" Highest element "+highestVal);

        }

        System.out.println("The 3rd largest element is "+ temp[2]);

    }
}
