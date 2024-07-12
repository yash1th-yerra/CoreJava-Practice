public class LinkedList {
    Node head;
    private int size;
    LinkedList(){
        this.size =0;
    }
    public class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
            this.next =null;
            size++;
        }
    }
    
    public void addFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void addLast(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode= lastNode.next;
        }
        lastNode.next = newNode;
    }
    public void printList(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+" -> ");
            currNode =currNode.next;
        }
        System.out.print("null");   
    }
    public void removeFirst(){

        if(head==null){
            System.out.println("Empty list,can't delete");
            return;
        }
        size--;
        head = this.head.next;
    }
    public void removeLast(){
        if(head==null){
            System.out.println("Empty list,can't delete");
            return;
        }
        size--;
        if(head.next==null){
            head = null;
            return;
        }
        Node currNode =head;
        Node lastNode=head.next;
        while(lastNode!=null){
            currNode = currNode.next;
            lastNode = lastNode.next;
            
        }
        currNode.next = null;
    }
    public void addAtIndex(int index,int data){
        if(index<0||index>size){
            System.out.println("Invalid Index");
            return;
        }
        size++;
        Node newNode = new Node(data);
        if(head==null||index==0){
            newNode.next =head;
            head=newNode;
            return;
        }
        Node currNode = head;
        for(int i=1;i<size;i++){
            if(i==index){
                Node nextNode = currNode.next;
                currNode.next = newNode;
                newNode.next = nextNode;
                break;
            }
            currNode =currNode.next;
        }
        

    }
    public static void main(String[] args){
        LinkedList list = new LinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addLast(2);
        list.addFirst(3);
        list.addLast(4);
        list.addLast(5);
        list.addAtIndex(3, 07);
        list.printList();

    }
}