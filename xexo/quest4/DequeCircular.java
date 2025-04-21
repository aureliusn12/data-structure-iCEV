package xexo.quest4;

public class DequeCircular {
    No head;
    No tail;

    public void inverter() {
        int count = 0;
        No actual = head;
        while (actual.prox != head) {
            count++;
            if(actual.prox.prox == head){
                count++;
            }
            actual = actual.prox;
        }
        No ultimoInvertido = head;
        this.head = ultimoInvertido.prox;
        this.tail = ultimoInvertido;
        while(count != 1){
            No element = head;
            head = head.prox;
            element.prox = ultimoInvertido;
            element.ant = ultimoInvertido.ant;
            element.ant.prox = element;
            ultimoInvertido.ant = element;
            head.ant = tail;
            tail.prox = head;
            ultimoInvertido = element;
            count--;
        }
    }
}
