package FourthQuestion;

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
            System.out.println("Lista prikita");
            return;
        }
        head = head.prox;
        head = null;
    }

    public void removeEnd(){
        if (head == null) {
            System.out.println("lista moiô");
            return;
        }
        if (head.prox == null) {
            head = null;
            tail = null;
        }
        tail.ant.prox = null;
        tail = tail.ant;

    }

    public void inverter(){
        No actual = head;
        No temp = null;

        while (actual != null) {
            temp = actual.ant;            
            actual.ant = actual.prox;
            actual.prox = temp;
            actual = actual.ant;
        }
        
        if (temp != null) {
            head = temp.ant;  
            tail = actual;   
        }
    }
    

    public void print(){
        No actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.prox;
        }
        System.out.println("null");
    }
}
