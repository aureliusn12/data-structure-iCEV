package CircleLinkedList;

public class app {
    public static void main(String[] args) {
        CircleLinkedList list = new CircleLinkedList();
        list.addFirst(20);
        list.addFirst(30);
        list.addFirst(50);
        list.print();
        list.addEnd(40);
        list.print();
    }
}
