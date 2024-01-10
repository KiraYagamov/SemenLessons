package Lesson3;

public class MyList<T> {
    private Node<T> head;
    private Node<T> tail;

    private int size;

    public void add(T value){
        Node<T> node = new Node<>(value);
        size += 1;

        if(head == null){
            head = node;
            tail = node;
        }
        else{
            head.nextNode = node;
            head = node;
        }
    }

    public T get(int index){
        if(index >= 0 && index < size) {
            Node<T> node = tail;
            for (int i = 0; i < index; i++) {
                node = node.nextNode;
            }
            return node.value;
        }
        else{
            return null;
        }
    }

    public int getSize(){
        return size;
    }
}
