package DoubleLinkedCircleList;

public class app {
    public static void main(String[] args) {
        DoubleLinkedCircleList list = new DoubleLinkedCircleList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.print();
        list.addEnd(40);
        list.print();
        list.removeFirst();
        list.print();
        list.removeLast();
        list.print();
    }
}
