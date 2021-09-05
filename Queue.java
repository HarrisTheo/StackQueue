

//AM4674 CHARALAMPOS THEODORIDIS
//AM4646 PANAGIOTIS GEORGIADIS
class Queue<Item> {
    private class Node{
        Item item;
        Node next;
        Node (Item item ){
            this.item=item;
            next=null;
        }
    }
    private Node head,tail;
    Queue() {
        /* enter your code! */
        head=null;
        tail=null;
    }
    
    boolean isEmpty() {
        return (head==null); // change appropriately
    }

    // insert new item in the queue
    void put(Item item) {
        /* enter your code! */
       Node t =tail;
       tail=new Node(item);
       if(isEmpty())head=tail;
       else t.next=tail;
    }

    // extract least recent item from the queue
    Item get() {
        /* enter your code */
        if(isEmpty())return head.item;
        Item item=head.item;
        Node temp=head.next;
        head=temp;
        return item;
       // change appropriately
    }
    
}
