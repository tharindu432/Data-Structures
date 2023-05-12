public class linked_list  {
    public static void main(String[] args) {
        LinkList k=new LinkList();
        k.insertFirst(8);
        k.insertFirst(5);
        k.insertFirst(2);
        k.insertFirst(56);
        k.displayList();
        k.deleteFirst();
        k.displayList();

    }
}

class Node {
    int data;
    Node next;
    Node(int item) {
        this.data=item;
        this.next=null;
    }
    void displayNode() {
        System.out.print(this.data+" ");


    }
}
class LinkList {
    private Node head;
    public  LinkList() {

        head = null;
    }
    public boolean isEmpty() {
        if(this.head==null){
            return true;
        }
        else{
            return false;
        }

    }
    public void insertFirst(int i) {
        Node x=new Node(i);
        x.next= head;
        head=x;





    }
    public Node deleteFirst() {
        if(isEmpty()){
            System.out.println("linked list is empty!");
            return null;
        }

        Node temp=this.head;
        this.head=this.head.next;
        temp.next=null;
        return temp;

    }
    public void displayList() {
        if(isEmpty()){
            System.out.println("linked is empty!");
            return;
        }
        Node current = head;
        while(current!=null){
            current.displayNode();
            current=current.next;


        }
        System.out.println();


    }
    public Node find(int key) {
        int count=1;
        Node current=head;
        while(current!=null){
            if(count==key){
                return current;
            }
             current=current.next;
             count++;

        }
        System.out.println("key value out of Linked list!");
        return null;

    }
    public void delete(int key) {

        Node previous,current;
        int count=1;
        current=head;
        previous=head;
        while(current!=null){
            if(count==key){
                if(key==1){
                   deleteFirst();
                }
                else{
                    previous.next=current.next;
                }
                System.out.println("item deleted!");

                return;
            }
            previous=current;
            current=current.next;
            count++;

        }

        System.out.println("item not found!");

    }
}
