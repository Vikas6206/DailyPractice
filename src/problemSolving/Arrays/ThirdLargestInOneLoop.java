package problemSolving.Arrays;

public class ThirdLargestInOneLoop {
    public static void main(String args[]){
        int arr[]={3,17,19,4,7,23,87};

        int firstLargest=0,secondLargest=0,thirdLargest=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>firstLargest){
                thirdLargest=secondLargest;
                secondLargest=firstLargest;
                firstLargest=arr[i];

            }else if( arr[i]>secondLargest && arr[i]!=firstLargest){
                thirdLargest=secondLargest;
                secondLargest=arr[i];
            }else if(arr[i]>thirdLargest && arr[i]!=secondLargest && arr[i]!=firstLargest){
                thirdLargest=arr[i];
            }
        }

        System.out.println("Third largest :"+thirdLargest);
        System.out.println("Second largest :"+secondLargest);
        System.out.println("First largest :"+firstLargest);
    }
}
