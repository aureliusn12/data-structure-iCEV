package SecondQuestion;

public class app {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addEnd(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addEnd(40);
        list.print();
        //list.removeFirst();
        //list.print();
        //list.removeEnd();
        //list.print();
        list.dividir();
        
    }
}
