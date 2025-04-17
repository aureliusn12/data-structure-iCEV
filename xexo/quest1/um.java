package xexo.quest1;

public class um {
    No head;

    public void dividirLista() {
        No actual = head;
        int pos = 0;
        um listaPar = new um();
        um listaImpar = new um();

        if (head == null) {
            return;
        }

        while (actual != null) {
            head = actual.prox;

            if (pos % 2 == 0) {
                actual.prox = null;
                listaPar.insert(actual.data);
            }

            if (pos % 2 != 0) {
                actual.prox = null;
                listaImpar.insert(actual.data);
            }
            actual = head;
            pos++;
        }
        listaImpar.print();
        listaPar.print();
    }

    public void insert(int data) {
        No actual = head;
        No newNo = new No(data);

        if (head == null) {
            head = newNo;
            return;
        }

        while (actual.prox != null) {
            actual = actual.prox;
            
        }
        actual.prox = newNo;

    }

    public void print(){
        No actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.prox;
        }
        System.out.println("null");        
    } 
    
    public static void main(String[] args) {
        um list = new um();
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);
        list.print();
        list.dividirLista();
    }
}
