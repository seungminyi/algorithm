package data_structure;

public class ArrayQueue<E> {
    private E[] array;
    private int head;
    private int tail;

    public ArrayQueue(int size){
        this.array = (E[]) new Object[size];
    }

    public boolean empty(){
        return head == tail;
    }

    public boolean full(){
        return (tail + 1) % array.length == head;
    }

    public void enqueue(E item){
        if(full()){
            throw new IllegalStateException("Queue is full");
        }
        array[tail] = item;
        tail = (tail + 1) % array.length;
    }

    public E dequeue(E item){
        if(empty()){
            throw new IllegalStateException("Queue is empty");
        }
        E result = array[head];
        head = (head + 1) % array.length;
        return result;
    }
}
