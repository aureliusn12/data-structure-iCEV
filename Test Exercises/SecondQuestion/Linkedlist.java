package SecondQuestion;

public class Linkedlist {
    No head;

    public void addFirst(int data){
        No x = new No(data);

        x.prox = head;
        head = x;
    }

    public void addEnd(int data){
        No y = new No(data);
        No actual = head;

        if (head == null) {
            head = y;
            return;
        }

        while (actual.prox != null) {
            actual = actual.prox;
        }

        actual.prox = y;
    }

    public void removeFirst(){
        if (head == null){
            System.out.println("lista vazia");
        }
        head = head.prox;
    }

    public void removeEnd(){
        No actual = head;
        if (head == null) {
            System.out.println("lista vazia");
            return;
        }
        while(actual.prox.prox != null){
            actual = actual.prox;
        }
        actual.prox = null;
    }

    public void dividir(){
        No actual = head;
        int pos = 0;
        Linkedlist listapar = new Linkedlist();
        Linkedlist listaimpar = new Linkedlist();


        if (head == null) {
            System.out.println("nao existe lista");
        }

        while (actual != null) {

            head = actual.prox;
            
            if (pos%2 != 0) { 
                actual.prox = null;
                listaimpar.insert(actual.data);
            }

            if (pos%2 == 0) { 
                actual.prox = null;
                listapar.insert(actual.data);
            }

            actual = head;
            pos++;
        }
        listaimpar.print();
        listapar.print();
    }

    public void insert(int data){
        No y = new No(data);
        No actual = head;

        if (head == null) {
            head = y;
            return;
        }

        while (actual.prox != null) {
            actual = actual.prox;
        }

        actual.prox = y;
    }

    public void print(){
        No actual = head;
        while (actual != null) {
            System.out.print(actual.data + " -> ");
            actual = actual.prox;
        }
        System.out.println("null");        
    } 
}

