package LinkedList;

public class ReverseLinkedList {
    static class Node
    {
        int data;
        Node next;

        public Node(int data){
            this.data=data;
            next = null;
        }
    }
    static Node head;

    void insert(int data)
    {
        if(head==null)
        {
            head = new Node(data);
            return;
        }
        Node temp= head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next= new Node(data);
    }

    void display()
    {
        Node print = head;
        while (print!=null)
        {
            System.out.print(print.data+ "->");
            print= print.next;
        }
        System.out.print("NULL");//End of list
    }
    //Reverse a Linked List
    public static Node reverseList(Node head) {
        Node prev = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next; // Store next node
            current.next = prev; // Reverse the pointer
            prev = current; // Move prev to current
            current = nextNode; // Move current to next node
        }
        return prev; // New head
    }
    public static void main(String[] args)
    {
        ReverseLinkedList list = new ReverseLinkedList();
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.insert(5);
        list.insert(6);
        //Original List
        System.out.println("Original List is: ");
        list.display();
        System.out.println(" ");
        head = reverseList(head);
        System.out.println("Reversed List is: ");
        list.display();

    }
}
