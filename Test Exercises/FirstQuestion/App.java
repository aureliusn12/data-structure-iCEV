package FirstQuestion;

public class App {
    public static void main(String[] args) {
        Deque list = new Deque();
        list.addEnd(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addEnd(40);
        list.print();
        list.removeFirst();
        list.print();
        list.removeEnd();
        list.print();
        list.rotate(1);
        list.print();
    }
}
