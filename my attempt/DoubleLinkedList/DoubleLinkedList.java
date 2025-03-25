package DoubleLinkedList;

public class DoubleLinkedList {
    No head;
    No tail;

    public void addFirst(int data){
        No newNo = new No(data);

        if (head == null) {
            head = newNo;
            tail = newNo;
            return;
        }
        newNo.prox = head;
        head.ant = newNo;
        head = newNo;

    }

    public void addLast(int data){

    }

    public void addAnywhere(int data, int index){

    }

    public void removeFirst(){

    }

    public void removeLast(){

    }

    public void removeAnywhere(){

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
