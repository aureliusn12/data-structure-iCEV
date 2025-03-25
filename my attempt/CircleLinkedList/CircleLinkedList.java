package CircleLinkedList;

public class CircleLinkedList {
    No head;
    No tail;

    public void addFirst(int data) {
        No newNode = new No(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.prox = head;
            return;
        }
        newNode.prox = head;
        head = newNode;
        tail.prox = head;
    }

    public void addEnd(int data) {
        No newNo = new No(data);

        if (head == null) {
            head = newNo;
            tail = newNo;
            tail.prox = head;
            return;
        }
        tail.prox = newNo;
        tail = newNo;
        tail.prox = head;
    }

    public void removeFirst() {
        if (head == null) {
            System.out.println("lista vazia");
            return;
        }
        else if (head.prox == head){
            head = null;
            tail = null;
            return;
        }
        head = head.prox;
        tail.prox = head;
    }

    public void removeLast() {
        No actual = head;
        if (head == null) {
            System.out.println("vida vazia");
        }

        else if(head.prox == head){
            head = null;
            tail = null;
        }

        while (actual.prox != tail) {
            actual = actual.prox;
        }
        tail = actual;
        tail.prox = head;
    }

    public void print() {
        No actual = head;

        if (head == null) {
            System.out.println("vida vazia");
        }

        do {
            System.out.print(actual.data + " -> ");
            actual = actual.prox;
        } while (actual != head);
        System.out.println("retorna para o head (" + head.data + ")");
    }
}