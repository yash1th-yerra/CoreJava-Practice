class Node{
    int data;
    Node next;
    /*Node(int data){
        this.data = data;
        this.next = null;
    }*/
}
public class LinkedListDemo{
    public static Node push(Node head,int A){
        Node n= new Node();
        n.next = head;
        head = n;
        return head;
    }
    public static Node deleteN(Node head,int position){
        Node temp = head;
        Node prev = head;
        for(int i=0;i<position;i++){
            if(i==0 && position==1){
                head=head.next;
            }
            else{
                if(i==position-1&&temp!=null){
                    prev.next = temp.next;
                }
                else{
                    prev=temp;
                    if(prev==null){
                        break;
                    }
                }
                temp=temp.next;

            }
        }
        return head;
    }
    public static void displayList(Node head){
        while(head!=null){
            if(head.next==null){
                System.out.println("data: "+head.data+" next address: "+null);
            }
            else{
                System.out.println("data: "+head.data+" next address: "+head.next);
            }
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String[] args){
        Node list = new Node();
        list.next = null;
        list = push(list,1);
        list = push(list,2);
        list = push(list,3);
        displayList(list);
        list = deleteN(list,1);
        displayList(list);
    }
}