package problemSolving;

import java.util.Arrays;

public class ArrayElementSorting {

    public int solution(int[] A) {
        // write your code in Java SE 8
        //format the input and sort it in asending order
        System.out.println("The value after being sorted is :");
        int [] B=Arrays.stream(A).sorted().distinct().toArray();
        int value=0,counter=1;

        for(int element:B){

            if(element<0){
                value=1;
                break;
            }
            if(element==counter){
                counter++;
            }else{
                value=counter;
                break;
            }
        }


       return value;
    }

    public static void main(String []args){
     ArrayElementSorting s = new ArrayElementSorting();
     int sol=s.solution(new int []{2,5,4,8,1,9,6,7});
     System.out.println("The final solution is :"+sol);
    }
}
