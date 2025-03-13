package LinkedList;
public class LinkedList {
    public static void add(Node head, Node newNode){
        Node pointer = head.pointer;
        while (pointer.pointer != null){
            pointer = pointer.pointer;
        }
        pointer.setPointer(newNode);
    }

    public static void remove(Node head, Node newNode, int position){
        int index = 0;
        Node actualNode = head;
        while(index < (position - 1) ){
            actualNode = actualNode.pointer;
            index++;
        }

    }

    public static void main(String[] args) {
        Node head = new Node("10");
        head.setPointer(new Node("2"));
        add(head, new Node("3"));
        System.out.println(head);
        Node newHead = new Node("newhead");
        newHead.setPointer(head);
    }
}