package DoubleLinkedList;

public class No {
    int dado;
    No prox;
    No ant;

    public No(int dado) {
        this.dado = dado;
        this.prox = null;
        this.ant = null;
    }

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    public No getAnt() {
        return ant;
    }

    public void setAnt(No ant) {
        this.ant = ant;
    }

}
