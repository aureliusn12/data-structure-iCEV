package xexo.quest4;

public class DequeCircle {
    No head;
    No tail;

    public void adicionarFim(int data) {
        No novo = new No(data);

        if (head == null) {
            head = novo;

        } else {
            tail = head.ant;

            novo = tail.prox;
            novo.ant = tail;

            novo.prox = head;
            head.ant = novo;
        }
    }

    public void inverter() {
        No actual = head;
        No temp;

        if (head == null) {
            return;
        }

        while (actual != tail) {
            temp = actual.prox;
            actual.prox = actual.ant;
            actual.ant = temp;

            actual = temp;

            if (actual == head) {
                break;
            }
        }
        head = head.prox;
    }

    public void imprimir() {
        if (head == null) {
            System.out.println("Deque vazio.");
            return;
        }

        No atual = head;
        while (true) {
            System.out.print(atual.data + " ");
            atual = atual.prox;
            if (atual == head)
                break;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DequeCircle list = new DequeCircle();
        list.adicionarFim(10);
        list.adicionarFim(20);
        list.adicionarFim(30);
        list.adicionarFim(40);
        list.adicionarFim(50);
        list.adicionarFim(60);
        list.imprimir();
    }
}
