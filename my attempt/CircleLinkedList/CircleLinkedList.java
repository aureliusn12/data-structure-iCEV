package CircleLinkedList;

public class CircleLinkedList {
    No head;
    No tail;

    public void addFirst(int data) {
        No newNode = new No(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            newNode.prox = head;
            return;
        }

        newNode.prox = head;
        tail.prox = newNode;
        tail = newNode;
    }

    public void addEnd(int data) {
        No newNode = new No(data);

        if (head == null) { 
            head = newNode;
            tail = newNode;
            tail.prox = head; 
            return;
        }

        tail.prox = newNode; 
        tail = newNode;
        newNode.prox = head; 
    }

    public void removeFirst() {

    }

    public void removeLast() {

    }

    public void print() {
        No actual = head;
        
        if (head == null) {
            System.out.println("lista xereka");
            return;
        }
        do {
            System.out.print(actual.data + " -> ");
            actual = actual.prox;
        } while (actual != head);
    
        System.out.println("(retorna ao início)" + head.data);
    }
}
