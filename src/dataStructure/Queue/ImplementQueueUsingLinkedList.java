package dataStructure.Queue;

import dataStructure.stack.Node;

public class ImplementQueueUsingLinkedList {
    //In dataStructure.Queue the elements are added to the rear and removed from the front
    // Q [Fromt,x,x,x,x,x,.... Rear]

    //Initially the queue is empty and we have front and rear = null
    Node front,rear;
    public ImplementQueueUsingLinkedList(){
        front=rear=null;
    }

    //enqueue
    public void enqueue(int data){
        Node newNode= new Node(data);
        if(rear==null) {
            rear = front=newNode;
        }
        rear.next=newNode;
        rear=newNode;
    }

    //dequeue
    public void dequeue(){
       //check if queue is empty
        if(front==null) {
            System.out.println("dataStructure.Queue is empty ..");
            return;
        }
       Node temp=front;
        front= front.next;
        if(front==null){
            rear=null;
        }
        System.out.println("Element dequeued is ..."+ temp.data);
    }

    //peek
    public void peekFront(){
        //if queue is empty
        if(front==null) {
            System.out.println("dataStructure.Queue is empty ..");
            return;
        }

        System.out.println("Element at the front is "+front.data);

    }

    //print
    public static void printAllQueueElement(ImplementQueueUsingLinkedList list){
        Node currentNode=list.front;
        System.out.println("dataStructure.Queue elements are as follows .....");
        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode=currentNode.next;
        }
        System.out.println("");
    }


    public static void main(String args[]){
    ImplementQueueUsingLinkedList implementQueueUsingLinkedList= new ImplementQueueUsingLinkedList();
    implementQueueUsingLinkedList.enqueue(2);
    implementQueueUsingLinkedList.enqueue(5);
    implementQueueUsingLinkedList.enqueue(26);
    implementQueueUsingLinkedList.enqueue(12);
    printAllQueueElement(implementQueueUsingLinkedList);
    implementQueueUsingLinkedList.dequeue();
    printAllQueueElement(implementQueueUsingLinkedList);
    }
}
