public class Node {
    public String data; 
    public Node pointer;

    public Node (String data){
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getPointer() {
        return pointer;
    }

    public void setPointer(Node pointer) {
        this.pointer = pointer;
    }

    @Override
    public String toString() {
        return "Node [data=" + data + ", pointer=" + pointer + "]";
    }
}
