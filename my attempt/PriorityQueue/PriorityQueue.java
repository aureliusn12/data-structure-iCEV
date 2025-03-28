package PriorityQueue;

public class PriorityQueue {
    private No head;
    private No tail;

    public void enqueue(int data, int priority) {
        No newNo = new No(data, priority);
        No actual = head;

        if (head == null) {
            head = tail = newNo;
            return;
        }

        while (actual != null && actual.priority >= priority) {
            actual = actual.prox;
        }

        if (actual == head) {
            newNo.prox = head;
            head.ant = newNo;
            head = newNo;

        } else if (actual == null) {
            tail.prox = newNo;
            newNo.ant = tail;
            tail = newNo;
            
        } else {
            newNo.prox = actual;
            newNo.ant = actual.ant;
            actual.ant.prox = newNo;
            actual.ant = newNo;
        }
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Fila de prioridade vazia!");
        }

        head = head.prox;
        if (head != null) {
            head.ant = null;
        } else {
            tail = null;
        }
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