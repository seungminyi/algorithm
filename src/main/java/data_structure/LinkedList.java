package data_structure;

import java.beans.IndexedPropertyDescriptor;
import java.util.*;

public class LinkedList<E> {
    private Node<E> head;
    private int size;

    LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public int size(){
        return size;
    }

    public boolean empty(){
        return  size == 0;
    }

    public E valueAt(int index){
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }

        Node<E> current = head;
        for(int i = 0; index > i; i++){
            current =  current.next;
        }

        return current.data;
    }

    public void pushFront(E item){
        Node<E> preNode = new Node<>(item);
        preNode.next = head;
        this.head = preNode;
        size++;
    }

    public E popFront(){
        if(size == 0){
            throw new NoSuchElementException();
        }
        E data = head.data;
        head = head.next;
        size--;
        return data;
    }

    public void pushBack(E item){
        if(head == null){
            head = new Node<E>(item);
        }else {
            Node<E> current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node<>(item);
        }
        size++;
    }

    public E popBack(){
        if(head == null){
            throw new NoSuchElementException();
        }
        Node<E> current = head;

        if(head.next == null){
            E result = head.data;
            head = null;
            size--;
            return result;
        }

        while (current.next != null){
            current = current.next;
        }

        E result = current.data;
        current = null;
        size--;
        return result;
    }

    public E front(){
        if(head == null){
            throw new NoSuchElementException();
        }
        return head.data;
    }

    public E back(){
        if(head == null){
            throw new NoSuchElementException();
        }
        Node<E> current = head;
        while (current.next != null){
            current = current.next;
        }
        return current.data;
    }

    public void insert(int index, E item){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for(int i = 0; i<index-1; i++){
            current = current.next;
        }
        Node<E> newNode = new Node<>(item);
        newNode.next = current.next;
        current.next = newNode;
        size++;
    }

    public void erase(int index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for(int i = 0; i < index -1; i++){
            current = current.next;
        }
        if(current.equals(head)){
            head = current.next;
        }else {
            System.out.println(current.data);
            current.next = current.next.next;
        }
        size--;
    }

    public E valueNFromEnd(int index){
        if(index > size || index < 0){
            throw new IndexOutOfBoundsException();
        }
        Node<E> current = head;
        for(int i = 0; i < size - index -1; i++){
            current = current.next;
        }
        return current.data;
    }

    public void reverse(){
        Node<E> current = head;
        Node<E> preNode = null;
        Node<E> nextNode;
        while (current.next != null){
            nextNode = current.next;
            current.next = preNode;
            preNode = current;
            current = nextNode;
        }
        current.next = preNode;
        head = current;
    }

    public int removeValue(E item){
        Node<E> current = head;
        for(int i = 0; i < size; i++){
            if(current.data.equals(item)){
                erase(i);
                size--;
                return i;
            }else {
                current = current.next;
            }
        }
        return -1;
    }

    public class Node<E>{
        E data;
        Node<E> next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }
    }
}


