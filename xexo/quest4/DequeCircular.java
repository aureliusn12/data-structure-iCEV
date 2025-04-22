package xexo.quest4;

public class DequeCircular {
    No head;
    No tail;

    public void inverter() {
        No actual = head;

        if (head == null){
             return;
        }

        while (actual.prox != head) {
            No temp = actual.prox;
            actual.prox = actual.ant;
            actual.ant = temp;
            actual = actual.ant;
        }

        No temp = actual.prox;
        actual.prox = actual.ant;
        actual.ant = temp;

        head = head.prox;
    }

    public void print() {
        if (head == null)
            return;

        No atual = head;
        boolean first = true;

        while (first || atual != head) {
            first = false;
            System.out.print(atual.data + " -> ");
            atual = atual.prox;
        }
        System.out.println("(volta ao head)");
    }

    public void addLast(int data) {
        No newNo = new No(data);
        if (head == null) {
            head = newNo;
            tail = newNo;
            head.prox = head;
            head.ant = head;
        } else {
            tail.prox = newNo;
            newNo.ant = tail;
            newNo.prox = head;
            head.ant = newNo;
            tail = newNo;
        }
    }

    public class Main {
        public static void main(String[] args) {
            DequeCircular deque = new DequeCircular();
            deque.addLast(1);
            deque.addLast(2);
            deque.addLast(3);
            deque.addLast(4);
            deque.addLast(5);
            deque.print();

            deque.inverter();
            deque.print();
        }
    }
}
