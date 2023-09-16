package ru.klimov.java.course.collection.linkedList;


import java.util.Iterator;

public class MainSingleList<T>
        implements Iterable<T> {

    private LinkItem<T> head;
    private LinkItem<T> tail;


    public boolean isEmpty() {
        return head == null;
    }

    public int size(){
        int count = 0;
        if (isEmpty()) return count;
        Iterator<T> iterator = this.iterator();
        while (iterator.hasNext()){
            iterator.next();
            count++;
        }
        return count;
    }

    public void addToEnd(T item) {
        LinkItem<T> newItem = new LinkItem<>();
        newItem.data = item;
        if (isEmpty()) {
            head = newItem;
            tail = newItem;
        } else {
            tail.next = newItem;
            tail = newItem;
        }
    }

    public void addToFirst(T item) {
        LinkItem<T> newItem = new LinkItem<>();
        newItem.data = item;
        if (isEmpty()) {
            head = newItem;
            tail = newItem;
        } else {
            newItem.next = head;
            head = newItem;
        }
    }

    public void remove(T val) {
        Iterator<T> iterator = this.iterator();
        LinkItem<T> prev = null;
        LinkItem<T> current = this.head;
        while (iterator.hasNext()) {
            if (current == null) break;
            if (current.data.equals(val)) {
                if (prev == null) {
                    this.head = current.next;
                } else {
                    prev.next = current.next;
                }
                break;
            }
            prev = current;
            current = current.next;
        }
    }

    public void reverse() {
        if (!isEmpty() && head.next != null) {
            tail = head;
            LinkItem<T> current = head.next;
            head.next = null;
            while (current != null) {
                LinkItem<T> next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new IteratorSingleList(head);
    }

    public void add(int position, T data) {
        if (position >= size() ){
            addToEnd(data);
        } else if (position <= 0) {
            addToFirst(data);
        } else {
            Iterator<T> iterator = this.iterator();
            LinkItem<T> current = this.head;
            int count = 1;
            while (iterator.hasNext()) {
                iterator.next();
                if (count == position) {
                    LinkItem<T> newItem = new LinkItem<>();
                    newItem.data = data;
                    newItem.next = current.next;
                    current.next = newItem;
                    break;
                }
                count++;
                current = current.next;
            }
        }
    }

    private class IteratorSingleList implements Iterator<T> {

        LinkItem<T> current;

        public IteratorSingleList(LinkItem<T> head) {
            this.current = head;
        }

        @Override
        public boolean hasNext() {
            return this.current != null;
        }

        @Override
        public T next() {
            T data = current.data;
            current = current.next;
            return data;
        }

    }

    private static class LinkItem<T> {
        T data;
        LinkItem<T> next;
    }
}
