public class LL {
    Node head;
    private int size;
    LL(){
        this.size =0;
    }
    public class Node{
        int data;
        Node next;
        Node(){}
        Node(int data){
            this.data = data;
            this.next = null;
            size++;
        }
    }
    public void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;    
        }
        Node lastNode = head;
        while(lastNode.next!=null){
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    public int SearchValue(int value){
        Node currNode = head;
        int index=0;
        while(currNode.next!=null){
            index++;
            if(currNode.data==value){
                break;
            }
            currNode = currNode.next;
            
        }
        if(index==0){
            return -1;
        }
        else{
            return index;
        }
    }
    public void displayList(){
        Node currNode = head;
        while(currNode!=null){
            System.out.print(currNode.data+"->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }
    public static void main(String[] args){
        LL list = new LL();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list.size);
        list.displayList();
        int index=list.SearchValue(7);
        System.out.println("index of 7 is "+index);

    }
}