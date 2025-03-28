package FourthQuestion;

public class app {
    public static void main(String[] args) {
        Deque list = new Deque();
        list.addEnd(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addEnd(40);
        list.print();
        list.inverter();
        list.print();
    }
}
