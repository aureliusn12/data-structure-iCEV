 package ThirdQuestion;

public class DoubleLinkedCircleList {
    No head;
    No tail;
    int size;

    public DoubleLinkedCircleList(){
        this.size = 0;
    }

    public void addFirst(int data){
        No newNode = new No(data);

        if (head == null) {
            head = newNode;
            head.prox = head;
            head.ant = head;
            tail = head;
            return;
        }
        newNode.prox = head;
        newNode.ant = tail;
        tail.prox = newNode; 
        head.ant = newNode;
        head = newNode;
        this.size++;
    }

    public void addEnd(int data){
        No newNode = new No(data);

        if (head == null) {
            head = newNode;
            tail = newNode;
            head.prox = head;
            head.ant = head;
            this.size++;
            return;
        } else {
        newNode.prox = head;
        newNode.ant = tail;
        tail.prox = newNode;
        head.ant = newNode;
        tail = newNode;
    }
    this.size++;    
        
    }

    public No removeFirst(){
        No n;
        if (head == null) {
            System.out.println("lista vazia");
            
        }
        else if (head == tail){
            head = null;
            tail = null;
            
        }
        n = head;
        head = head.prox;
        head.ant = tail;
        tail.prox = head;
        this.size--;
        return n;
    }

    public void removeLast(){
        if (head == null) {
            System.out.println("lista vazia");
        }
        else if(head == tail){
            head = null;
            tail = null;
        }
        tail = tail.ant;
        tail.prox = head;
        head.ant = tail;
        this.size--;
    }

    /*public void deslocar(){
        int i = 0;

        while (i < list.getsize()) {
            
        }
        
    }
*/
    public void print(){
        No actual = head;

        if(head == null){
            System.out.println("lista vazia");
            return;
        }
        do {
            System.out.print(actual.data + " -><- ");
            actual = actual.prox;

        } while (actual != head);
        System.out.println("aponta pro head (" + actual.data + ")");
    }

}
