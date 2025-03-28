package FirstQuestion;

public class Deque {
    No head;
    No tail;

    public void addFirst(int data) {
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

    public void addEnd(int data) {
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

    public No removeFirst() {
        No first = head;

        if (head == null) {
            System.out.println("Lista vazia");
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.prox;
            head.ant = null;
        }
        return first;
    }

    public No removeEnd() {
        No last = tail;

        if (head == null) {
            System.out.println("Lista vazia");
            return null;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            tail = tail.ant;
            tail.prox = null;
        }
        return last;

    }

    public void rotate(int k) {
        No firstvalue;
        No lastvalue;

        if (head == null || tail == null) {
            return;
        }

        if (k > 0) {
            for (int i = 0; i < k; i++) {
                firstvalue = removeFirst();

                if (firstvalue != null) {
                    addEnd(firstvalue.data);
                }
            }
        } else {
            for (int i = 0; i > k; i--) {
                lastvalue = removeEnd();

                if (lastvalue != null) {
                    addFirst(lastvalue.data);
                }
            }
        }
    }

    public void print() {
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
