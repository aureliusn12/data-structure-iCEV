public class listaCircular {
    No head;
    No tail;

    public void add(int data) {
        No newNo = new No(data);

        if (head == null) {
            head = newNo;
            tail = newNo;
            head.prox = head;
            head.ant = head;
        }

        tail.prox = newNo;
        newNo.ant = tail;
        newNo.prox = head;
        head.ant = newNo;
        tail = newNo;

    }

    public void deslocar(No inicio, No fim) {
        No temp;

        No actual = head;


        while (actual.prox != inicio) {
            actual = actual.prox;
        }

        while (inicio != fim) {
            temp = inicio;
            actual.prox = temp.prox;
            temp.prox.ant = actual;
            temp.ant = tail;
            tail.prox = temp;
            temp.prox = head;
            head.ant = temp;
            tail = temp;
            inicio = actual.prox;
        }

        if (inicio == fim) {
            temp = inicio;
            actual.prox = temp.prox;
            temp.prox.ant = actual;
            temp.ant = tail;
            tail.prox = temp;
            temp.prox = head;
            head.ant = temp;
            tail = temp;
        }
    }

    public void print() {
        No actual = head;

        if (head == null) {
            System.out.println("vida vazia");
        }

        do {
            System.out.print(actual.data + " -> ");
            actual = actual.prox;
        } while (actual != head);
        System.out.println("retorna para o head (" + head.data + ")");
    }

    public static void main(String[] args) {
        listaCircular list = new listaCircular();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.print();
        list.deslocar(null, null);
        list.print();
    }
}
