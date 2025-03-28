package PriorityQueue;

class No {
    int data;
    int priority;
    No prox;
    No ant;

    public No(int data, int priority) {
        this.data = data;
        this.priority = priority;
        this.prox = null;
        this.ant = null;
    }
}