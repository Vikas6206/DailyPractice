package dataStructure.stack;

public class ImplementStackUsingArray {
    static final int MAX=100;
    //data structure
    int []a = new int[MAX];
    int top;
    //constructor
    ImplementStackUsingArray(){
        top=-1;
    }
    //methods
    boolean isEmpty(){
        return (top<0);
    }

    //push
    boolean push(int data){
        //check full
        if(top>=(MAX-1)){
            return false;
        }else{
            a[++top]=data;
            return true;
        }
    }
    //pop
    boolean pop(){
        //check empty
        if(top<0){
            return  false;
        }else {
            int x=a[top--];
            System.out.println("The element deleted is "+x);
            return true;
        }
    }

    //print
    void print(){
        if(top<0){
            System.out.println(" Stack is empty ...");
            return;
        }else{
            for(int i=top;i>=0;i--){
                System.out.print(a[i]+" ");
            }
            System.out.println("");
        }
    }

    //peek
    void peek(){
        if(top<0){
            System.out.println(" Stack is empty ...");
            return;
        }else {
            System.out.println("Element at top is :"+a[top]);
        }
    }

    //main method
    public static void main(String []args){
ImplementStackUsingArray implementStackUsingArray= new ImplementStackUsingArray();
implementStackUsingArray.push(2);
implementStackUsingArray.push(3);

        implementStackUsingArray.push(5);
        implementStackUsingArray.print();
implementStackUsingArray.peek();
implementStackUsingArray.pop();
implementStackUsingArray.print();



    }
}
