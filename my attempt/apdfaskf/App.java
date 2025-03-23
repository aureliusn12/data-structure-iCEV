package apdfaskf;

public class App {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addAtFirst(2);
        list.addAtFirst(3);
        list.addAtEnd(6);
        list.addAtFirst(9);
        list.addAtEnd(12);
        list.addAtEnd(10);
        list.removeEnd();
        //list.removeFirst();
        list.print();
    }
}
