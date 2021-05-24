package dataStructure.stack;

/**
 * Implement dataStructure.stack using the linked list
 */
public class ImplementStackUsingLinkedList {

    private static Node head=null;
    static ImplementStackUsingLinkedList implementStackUsingLinkedList = new ImplementStackUsingLinkedList();

    //push operation
    public static void push(int data){
        Node newNode = new Node(data);
        newNode.next =head;
        head=newNode;
    }

    //pop operation
    public static void pop(){
        Node temp=head;
        head=head.next;
        System.out.println("The data deleted here is "+temp.data);
    }

    //peek operation
    public static void peek(){
        System.out.println("The element at the peek is "+head.data);
    }

    //print all element
    public static void printAllElement(ImplementStackUsingLinkedList list){
        Node currentNode=list.head;

        while(currentNode!=null){
            System.out.print(currentNode.data+" ");
            currentNode = currentNode.next;
        }
        System.out.println("");
    }

    public static void main(String args[]){
        implementStackUsingLinkedList.push(2);
        implementStackUsingLinkedList.push(7);
        implementStackUsingLinkedList.push(20);
        implementStackUsingLinkedList.peek();
        implementStackUsingLinkedList.push(35);
        printAllElement(implementStackUsingLinkedList);
        implementStackUsingLinkedList.pop();
        printAllElement(implementStackUsingLinkedList);

    }
}
