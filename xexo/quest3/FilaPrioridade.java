package xexo.quest3;

public class FilaPrioridade {
    No head;
    No tail;
    FilaPrioridade F1 = new FilaPrioridade();
    FilaPrioridade F2 = new FilaPrioridade();

    public void add(int data, int priority) {
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

    public void addAsFilas(int data, int priority) {

        if (priority > 5) {
            F2.add(data, priority);
            return;
        }

        if (priority <= 5 && priority >= 0) {
            F1.add(data, priority);
            return;
        }
    }

    public void remove(int priority) {
        No actual = head;
        No temp;
        if (head == null) {
            return;
        }
        if (head == tail) {
            head = tail = null;
            return;
        }

        if (priority == head.priority) {
            head = head.prox;
            head.ant = null;
            return;
        }

        if (priority == tail.priority) {
            tail = tail.ant;
            tail.prox = null;
            return;
        }

        while (actual.prox != null && actual.prox.priority < priority ) {
            actual = actual.prox;

            if (priority > 5) {
                F2.remove(priority);
                return;
            }

            if (priority <= 5 && priority >= 0) {
                F1.remove(priority);
                return;
            }

        }
        temp = actual.prox;
        actual.prox = actual.prox.prox;
        actual.prox.ant = actual;
        temp.prox = temp.ant = null;
    }

}
