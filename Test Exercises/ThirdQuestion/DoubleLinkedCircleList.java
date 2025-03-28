 package ThirdQuestion;

public class DoubleLinkedCircleList {
    No head;
    No tail;

    public void addFirst(int data){
        No newNode = new No(data);

        if (head == null) {
            head = newNode;
            head.prox = head;
            head.ant = head;
            tail = head;
            return;
        }
        newNode.prox = head;
        newNode.ant = tail;
        tail.prox = newNode; 
        head.ant = newNode;
        head = newNode;
    }

    public void addEnd(int data){
        No newNode = new No(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prox = head;
            head.ant = head;
            return;
        }
        tail.prox = newNode;
        newNode.ant = tail;
        tail = newNode;
        tail.prox = head;
        head.ant = tail;
    }

    public void removeFirst(){
        if (head == null) {
            System.out.println("lista vazia");
            return;
        }
        else if (head == tail){
            head = null;
            tail = null;
            return;
        }
        head = head.prox;
        head.ant = tail;
        tail.prox = head;

    }

    public void removeLast(){
        if (head == null) {
            System.out.println("lista vazia");
        }
        else if(head == tail){
            head = null;
            tail = null;
        }
        tail = tail.ant;
        tail.prox = head;
        head.ant = tail;
    }

    public void deslocar(){
        
    }

    public void print(){
        No actual = head;

        if(head == null){
            System.out.println("lista vazia");
            return;
        }
        do {
            System.out.print(actual.data + " -><- ");
            actual = actual.prox;

        } while (actual != head);
        System.out.println("aponta pro head (" + actual.data + ")");
    }

}
