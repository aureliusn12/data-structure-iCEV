package xexo.quest4;

public class DequeCircular {
    No head;
    No tail;

    public void inverter() {
        No actual = head;

        if (head == null || head == tail) {
            return;
        }

        do {
            No temp = actual.prox;
            actual.prox = actual.ant;
            actual.ant = temp;
            actual = temp;

        } while (actual != head);

        No temp = head;
        head = tail;
        tail = temp;

    }
}
