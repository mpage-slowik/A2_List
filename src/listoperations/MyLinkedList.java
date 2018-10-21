package listoperations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Max Page-Slowik
 * @author Jesse Silber
 */
public class MyLinkedList<E> implements List {

    private class Node {

        E element;
        Node next;
        Node prev;

        public Node(E element, Node next, Node prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }

    }

    private Node head;
    private Node tail;
    private int size;

    public MyLinkedList() {
        size = 0;
    }

    @Override
    public int size() {
        return size - 1;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean add(Object e) {
        Node temp = new Node((E) e, null, null);
        if (size == 0) {
            tail = temp;
            head = tail;
            size++;
            return true;
        } else {
            temp.prev = tail;
            tail.next = temp;
            tail = temp;
            size++;
            return true;
        }
    }

    @Override
    public void add(int index, Object element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        Node temp = head;
        Node newNode = new Node((E) element, null, null);
        for (int i = 0; i < size; i++) {
            if (i == index) {
                if (temp.equals(head)) {
                    temp.prev = newNode;
                    newNode.prev = null;
                    newNode.next = temp;
                    head = newNode;
                } else if (temp.equals(tail)) {
                    temp.next = newNode;
                    newNode.prev = temp;
                    newNode.next = null;
                    tail = newNode;
                } else {
                    newNode.prev = temp.prev;
                    newNode.next = temp;
                    temp.prev = newNode;
                    newNode.prev.next = newNode;
                }
                size++;
                return;
            }
            temp = temp.next;
        }
    }

    @Override
    public Object remove(int index) {
        if (index >= size || isEmpty()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
        if (index == (size - 1)) {
            Node temp = tail;
            tail = temp.prev;
            tail.next = null;
            return temp;
        } else if (index == 0) {
            Node temp = head;
            head = temp.next;
            head.prev = null;
            return temp;

        } else {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                if (i == index) {
                    Node n = temp.prev;
                    Node m = temp.next;
                    n.next = m;
                    m.prev = n;
                    size--;
                    return temp;
                }
                temp = temp.next;
            }
        }
        return null;
    }

    @Override
    public boolean remove(Object o) {
        if (o.equals(head)) {
            Node temp = head;
            head = temp.next;
            head.prev = null;
            return true;
        } else if (o.equals(tail)) {
            Node temp = tail;
            tail = tail.prev;
            tail.next = null;
            return true;
        } else {
            Node temp = head;
            for (int i = 0; i < size; i++) {
                if (temp.element.equals(o)) {
                    temp.next.prev = temp.prev;
                    temp.prev.next = temp.next;
                    size--;
                    return true;
                }
                temp = temp.next;
            }
        }
        return false;
    }

    @Override
    public void clear() {
        size = 0;
        tail = null;
        head = null;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(temp.element).append(",");
            temp = temp.next;
        }
        sb.deleteCharAt(sb.lastIndexOf(",")).append("]");
        return sb.toString();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
