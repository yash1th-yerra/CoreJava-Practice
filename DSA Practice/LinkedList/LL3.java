public class LL3{
    Node head;
    private int size;
    LL3(){
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
    public void removeMultiple10(){
        Node currNode = head;
        while(currNode.next!=null){
            if(currNode.data %10==0){
                currNode =currNode.next;
                currNode.next = currNode.next.next;
            }
            currNode = currNode.next;
        }

    }
    public static void main(String[] args){
        LL3 list = new LL3();
        for(int i=1;i<=50;i++){
            list.add(i);
        }
        System.out.println("Size of the Linked List is "+list.size);
        list.printList();
        list.removeMultiple10();
        System.out.println("After Removing elements multiples of 10");
        list.printList();
    }
}