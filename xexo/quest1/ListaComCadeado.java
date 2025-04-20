package xexo.quest1;

public class ListaComCadeado {
    No head;

    public class No {
        int data;
        No prox;
    
        public No(int data){
            this.data = data;
            this.prox = null;
        }
    }

    public void dividirListas() {
        No actual = head;
        int pos = 0;
        ListaComCadeado listaPar = new ListaComCadeado();
        ListaComCadeado listaImpar = new ListaComCadeado();

        while (actual != null) {

            if (pos % 2 == 0) {
                listaPar.insert(actual.data);
                return;
            }

            if (pos % 2 != 0) {
                listaImpar.insert(actual.data);
                return;
            }
        }
        actual = actual.prox;
        pos++;
    }

    public void juntarListas(){
        No actual = head;
    
        while (actual != null) {
            actual = actual.prox;
        }

    }

    public void insert(int data){
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

    public void imprimir() {
        No atual = head;
        while (atual != null) {
            System.out.print(atual.data + " ");
            atual = atual.prox;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        ListaComCadeado lista = new ListaComCadeado();
        lista.insert(1);
        lista.insert(2);
        lista.insert(3);
        lista.insert(4);
        lista.insert(5);
        lista.insert(6);

        lista.dividirListas();
    }
}
