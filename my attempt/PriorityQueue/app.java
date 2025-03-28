package PriorityQueue;

public class app {
    public static void main(String[] args) {
        PriorityQueue list = new PriorityQueue();

        list.enqueue(10, 2);
        list.enqueue(20, 1);
        list.enqueue(30, 3);
        list.enqueue(40, 4);
        list.enqueue(60, 3);
        list.enqueue(80, 1);
        
        list.print();
        list.dequeue();
        list.print(); 
    }
}
