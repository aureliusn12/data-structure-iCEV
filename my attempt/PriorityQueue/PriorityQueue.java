package PriorityQueue;

public class PriorityQueue {
    private No head;
    private No tail;

    public void add(int data, int priority) {
        No newNo = new No(data, priority);
        No actual = head;

        if (head == null) {
            head = tail = newNo;
            return;
        }

        if (priority <= head.priority) {
            head.ant = newNo;
            newNo.prox = head;
            head = newNo;
            return;
        }

        if (priority > tail.priority) {
            tail.prox = newNo;
            newNo.ant = tail;
            tail = newNo;
            return;
        }

        while (actual.prox != null && actual.prox.priority < priority) {
            actual = actual.prox;
        }
        
        newNo.ant = actual;
        newNo.prox = actual.prox;
        actual.prox = newNo;
        newNo.prox.ant = newNo;

    }

    public void print() {
        if (head == null) {
            System.out.println("Fila de prioridade vazia");
            return;
        }
        No temp = head;
        while (temp != null) {
            System.out.print("[Dado: " + temp.data + ", Prioridade: " + temp.priority + "] <-> ");
            temp = temp.prox;
        }
        System.out.println("null");
    }
}