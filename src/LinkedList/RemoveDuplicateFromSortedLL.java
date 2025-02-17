package LinkedList;

public class RemoveDuplicateFromSortedLL{
    static class Node
    {
        int data;
        Node next;

        private Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    Node head;

    void insert(int data)
    {
        if(head==null)
        {
            head=new Node(data);
            return;
        }
        Node temp = head;
        while (temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = new Node(data);
    }
    void printList()
    {
        Node temp=head;
        if(head==null)
            System.out.println("List is Empty");
        while (temp!=null)
        {
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.print("NULL");
        System.out.println(" ");
    }
    void removeDuplicates()
    {
        Node current=head;
        Node prev;
        while (current!=null && current.next!=null)
        {
            if(current.data==current.next.data)
            {
                current.next=current.next.next;
            }
            else
            {
                current=current.next;
            }
        }
    }
    public static void main(String[] args)
    {
        RemoveDuplicateFromSortedLL list = new RemoveDuplicateFromSortedLL();
        list.insert(10);
        list.insert(20);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(40);
        list.insert(50);
        list.printList();
        list.removeDuplicates();
        list.printList();
    }

}
