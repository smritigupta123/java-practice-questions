package LinkedList;

import java.util.HashSet;

public class RemoveDuplicateFromUnsortedLL {
    static class Node
    {
        int data;
        Node next;
        private Node(int data)
        {
            this.data = data;
            next=null;
        }
    }
    Node head;
    void insert(int data)
    {
        Node temp = head;
        if(head==null)
        {
            head = new Node(data);
            return;
        }
        while (temp.next!=null)
        {
            temp= temp.next;
        }
        temp.next= new Node(data);
    }
    void printList()
    {
        Node temp = head;
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
    void removeDuplicateUnsorted()
    {
        HashSet<Integer> set = new HashSet<>();
        Node current = head;
        Node prev = null;
        while (current!=null)
        {
            if(set.contains(current.data))
            {
                prev.next = current.next;
            }
            else
            {
                set.add(current.data);
                prev=current;
            }
            current=current.next;
        }
    }
    public static void main(String[] args)
    {
        RemoveDuplicateFromUnsortedLL list = new RemoveDuplicateFromUnsortedLL();
        list.insert(20);
        list.insert(20);
        list.insert(10);
        list.insert(11);
        list.insert(5);
        list.insert(20);
        list.insert(5);
        list.insert(10);
        list.insert(9);
        list.printList();
        list.removeDuplicateUnsorted();
        list.printList();

    }
}
