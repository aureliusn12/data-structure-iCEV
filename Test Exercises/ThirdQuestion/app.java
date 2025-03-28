package ThirdQuestion;

public class app {
    public static void main(String[] args) {
        DoubleLinkedCircleList list = new DoubleLinkedCircleList();
        list.addEnd(10);
        list.addEnd(20);
        list.addEnd(30);
        list.addEnd(40);
        list.addEnd(50);
        list.print();
        int i = 0;
        System.out.println(list.size);
        System.out.println("-----------");
        while (i < list.size) {
            int n = list.removeFirst().data;
            list.addEnd(n);
            i++;
            list.print();
        }
    }
}