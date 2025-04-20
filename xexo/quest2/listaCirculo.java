public class listaCirculo {
    No head;
    No tail;

    public void deslocar(No inicio, No fim){
        No actual = head;
        No temp;

        while (actual.prox != head) {
            actual = actual.prox;
        }

        while (inicio != fim) {
            temp = inicio;
            actual.prox = temp.prox;
            actual.prox.ant = temp.ant;
            temp.ant = tail;
            tail.prox = temp;
            head = temp.prox;
            head.ant = temp;
            tail = temp;
            inicio = actual.prox;
        }

        while (inicio == fim) {
            temp = inicio;
            actual.prox = temp.prox;
            actual.prox.ant = temp.ant;
            temp.ant = tail;
            tail.prox = temp;
            head = temp.prox;
            head.ant = temp;
            tail = temp;
        }
    }
}
