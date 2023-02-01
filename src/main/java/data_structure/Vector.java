package data_structure;

public class Vector<T> {
    private T[] data;
    private int size;
    private int capacity;

    public Vector() {
        this(16);
    }

    public Vector(int capacity) {
        this.capacity = capacity;
        this.data = (T[]) new Object[capacity];
        this.size = 0;
    }

    public int size() {
        return size;
    }

    public int capacity() {
        return capacity;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public T at(int index) {
        if (index >= size){
            throw new IndexOutOfBoundsException();
        }
        return data[index];
    }

    public void push(T item) {
        if(size == capacity){
            resize(capacity * 2);
        }
        data[size++] = item;
    }

    public void insert(int index, T item) {
        if (index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        if (size == capacity){
            resize(capacity * 2);
        }
        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[index] = item;
        size++;
    }

    public void prepend(T item) {
        insert(0,item);
    }

    public T pop() {
        if(isEmpty()){
            throw new ArrayIndexOutOfBoundsException();
        }
        T result = data[--size];
        data[size] = null;
        if (size == capacity / 4){
            resize(capacity/2);
        }
        return result;
    }

    public void delete(int index) {
        if(index >= size){
            throw new ArrayIndexOutOfBoundsException();
        }
        for(int i = size-1; i > index; i--){
            data[i-1] = data[i];
        }
        data[size--] = null;
        if(size == capacity / 4){
            resize(capacity / 2);
        }
    }

    public int remove(T item) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(item)){
                delete(i);
                return i;
            }
        }
        return -1;
    }

    public int find(T item) {
        for(int i = 0; i < size; i++){
            if(data[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    private void resize(int newCapacity) {
        capacity = newCapacity;
        T[] newData = (T[]) new Object[newCapacity];
        System.arraycopy(data,0, newData, 0, size);
        this.data = newData;
    }

}
