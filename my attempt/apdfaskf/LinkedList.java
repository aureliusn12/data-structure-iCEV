package apdfaskf;

public class LinkedList {
    Node head;

    public void addAtFirst(int data){
        Node x = new Node(data);
        x.next = head;
        head = x;
    }

    public void addAtEnd(int data){
        Node y = new Node(data);
        Node actual = head;

        if (head == null) {
            head = y;
            return;
        }

        while (actual.next != null) {
            actual = actual.next;
        }

        actual.next = y;
    }

    public void removeFirst(){
        if (head == null){
            System.out.println("lista vazia");
        }
        head = head.next;
    }

    public void removeEnd(){
        Node actual = head;
        if (head == null) {
            System.out.println("lista vazia");
            return;
        }
        while(actual.next.next != null){
            actual = actual.next;
        }
        actual.next = null;
    }
    
    public void print(){
        Node actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.next;
        }
        System.out.println("null");        
    } 
}