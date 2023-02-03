package data_structure;

public class LinkedListQueue<E> extends LinkedList<E>{

    public void enqueue(E item){
        pushBack(item);
    }

    public E dequeue(){
        return popFront();
    }
}

