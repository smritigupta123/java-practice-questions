package LinkedList;
//Find first, last and mid of linked list

public class CustomLinkedList {
    class Node
    {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head;
    //Function to add element to a linked list
    void insert(int data) {
        if(head==null)
        {
            head = new Node(data);
            return;
        }

        Node temp = head;

        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=new Node(data);
    }
    void findNodes()
    {
        if(head==null)
            return;

        //First node
        Node first = head;

        //last node
        Node last=head;
        while(last.next!=null)
        {
            last = last.next;
        }

        //Middle
        Node slow=head, fast=head;
        while (fast !=null && fast.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        System.out.println("First Element is: " +first.data);
        System.out.println("Middle Element is: " + slow.data);
        System.out.println("Last Element is: " +last.data);
    }
    public static void main(String[] args)
    {
        CustomLinkedList list = new CustomLinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(5);
        list.insert(7);
        list.insert(21);
        list.findNodes();
    }

}
