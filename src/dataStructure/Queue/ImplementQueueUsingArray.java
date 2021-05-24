package dataStructure.Queue;

public class ImplementQueueUsingArray {

    //create an array of fixed size
    static final int MAX=100;
    //data structure
    int []a = new int[MAX];
    int rear;
    //constructor
    ImplementQueueUsingArray(){
        rear=0;
    }

    boolean isEmpty(){
        return rear==0;
    }

    //enqueue
    public void enqueue(int data){
        if(rear>=(MAX-1)){
            System.out.println("dataStructure.Queue is full ...");
            return;
        }else{
            a[rear++]=data;
        }
    }


    //dequeue
    public void dequeue(){
        if(isEmpty()){
            System.out.println("dataStructure.Queue is empty ...");
            return;
        }else{
            int data=a[0];

            //swap the data element
            for(int i=0;i<rear-1;i++){
                a[i]=a[i+1];
            }
            System.out.println("Element deleted is ... "+data);
        }
    }

    //printAllElement

    public  void printAllElement(){
        for(int i=0;i<rear;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println("");
    }

    public static void main(String args[]){
    ImplementQueueUsingArray implementQueueUsingArray = new ImplementQueueUsingArray();
    implementQueueUsingArray.enqueue(2);
    implementQueueUsingArray.enqueue(34);
        implementQueueUsingArray.enqueue(29);
        implementQueueUsingArray.enqueue(3);
        implementQueueUsingArray.printAllElement();
        implementQueueUsingArray.dequeue();
        implementQueueUsingArray.printAllElement();
    }
}
