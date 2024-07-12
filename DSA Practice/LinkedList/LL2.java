public class LL2{
    Node head;
    private int size;
    LL2(){
        this.size =0;
    }
    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;

    }
    public void printList(){
        Node currNode  =head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode=currNode.next;
        }
        System.out.println("NULL");
    }
    public void removeGreater25(int value){
        Node currNode = head;
        while(currNode!=null){
            if(currNode.data==value){
                currNode.next = null;
                break;
            }
            currNode= currNode.next;
        }

    }
    public static void main(String[] args){
        LL2 list = new LL2();
        for(int i=1;i<=50;i++){
            list.add(i);
        }
        System.out.println("Size of the Linked List is "+list.size);
        list.printList();
        list.removeGreater25(25);
        System.out.println("After Removing elements greater than 25");
        list.printList();
    }
}