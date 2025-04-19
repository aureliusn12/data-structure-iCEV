public class ListaEncadeada {
    Node head;

    public void add(int data, int pos){
        Node newNo = new Node(data);
        Node actual = head;
        int i = 0;

        if (pos == 0) {
            head = newNo;
        }
        else{
            while (actual.next != null && i < pos -1) {
                actual = actual.next;
                i++;
            }
            newNo.next = actual.next;
            actual.next = newNo;
        }

    }
}
