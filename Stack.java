//AM4674 CHARALAMPOS THEODORIDIS
//AM4646 PANAGIOTIS GEORGIADIS


public class Stack<Item> {
    private Node head;
    private Item[] Item;

    private class Node{
        Item item;
        Node next;
        Node(Item item, Node next){
            this.item=item;
            this.next=next;
        } 
    }

    Stack() {
        /* enter your code! */
        head=null;
    }

    boolean isEmpty() {
        return head==null; // change appropriately
    }

    // insert new item on top of the stack
    void push(Item item) {
        /* enter your code! */
        head=new Node(item,head);
    }

    // extract most recent item from the top of the stack
    Item pop() {
        /* enter your code */
        if(isEmpty())return null;
        Item item=head.item;
        Node t=head.next;
        head=t;
        return item;
       // change appropriately
    }
}
