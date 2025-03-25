package DoubleLinkedCircleList;

public class DoubleLinkedCircleList {
    No head;
    No tail;

    public void addFirst(int data){
        No newNode = new No(data);

        if (head == null) {
            head = newNode;
            head.prox = head;
            head.ant = head;
            tail = head;
            return;
        }
        newNode.prox = head;
        newNode.ant = tail;
        tail.prox = newNode; 
        head.ant = newNode;
        head = newNode;
    }

    public void addEnd(int data){

    }

    public void removeFirst(){

    }

    public void removeLast(){

    }

    public void print(){
        No actual = head;

        if(head == null){
            System.out.println("lista vazia");
            return;
        }
        do {
            System.out.print(actual.data + " -><- ");
            actual = actual.prox;

        } while (actual != head);
        System.out.println("aponta pro head (" + actual.data + ")");
    }

}
