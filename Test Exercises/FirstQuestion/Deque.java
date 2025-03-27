package FirstQuestion;

public class Deque {
    No head;
    No tail;

    public void addFirst(int data){
        No newNo = new No(data);

        if (head == null) {
            head = newNo;
            tail = newNo;
            return;
        }
        newNo.prox = head;
        head.ant = newNo;
        head = newNo;
    }

    public void addEnd(int data){
        No newNo = new No(data);

        if (head == null) {
            head = newNo;
            tail = newNo;
            return;
        }
        tail.prox = newNo;
        newNo.ant = tail;
        tail = newNo;
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("Lista vazia");
        }
        else if (head == tail) {
            head = null;
            tail = null;
        }
        head = head.prox;
        head.ant = null;
    }

    public void removeLast(){
        if (head == null) {
            System.out.println("Lista vazia");
        }
        else if (head == tail) {
            head = null;
            tail = null;
        }
        tail = tail.ant;
        tail.prox = null;
    }

    public void rotate(){

    }

    public void print(){
        No actual = head;
        if (actual == null) {
            System.out.println("Lista vazia");
        }
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.prox;
        }
        System.out.println("null");
    }
}
