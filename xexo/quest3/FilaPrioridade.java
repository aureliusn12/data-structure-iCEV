package xexo.quest3;

public class FilaPrioridade {
    No head;
    No tail;

    public void add(int data, int priority){
        No actual = head;
        No novoNo = new No(data, priority);

        if (head == null) {
            head = tail = novoNo;
            return;
        }

        if (priority <= head.priority) {
            novoNo.prox = head;
            head.ant = novoNo;
            head = novoNo;
            return;
        }

        if (priority > tail.priority) {
            novoNo.ant = tail;
            tail.prox = novoNo;
            tail = novoNo;
            return;
        }

        while (actual.prox != null && actual.priority < priority) {
            actual = actual.prox;
        }
        novoNo.ant = actual;
        novoNo.prox = actual.prox;
        actual.prox.ant = novoNo;
        actual.prox = novoNo;
    }
}
