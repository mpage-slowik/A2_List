package listoperations;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Max Page-Slowik
 * @author Jesse Silber
 * @param <E>
 *
 */
public class MyArrayList<E> implements List {

    private E arr[];
    private int size;

    public MyArrayList() {
        arr = (E[]) new Object[10];
        size = 0;
    }

    public MyArrayList(int size) {
        arr = (E[]) new Object[size];
        this.size = 0;
    }

    /**
     * Adds object to the list
     *
     * @param e
     * @return boolean
     */
    @Override
    public boolean add(Object e) {
        boolean added = false;
        if (arr != null) {
            resize();
            arr[size] = (E) e;
            size++;
            added = true;
        }
        return added;
    }

    /**
     * Adds element to list based on index.
     *
     * @param index
     * @param element
     */
    @Override
    public void add(int index, Object element) {
        if (index > size) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        } else {
            resize();
            if (index <= size) {
                E arr2[] = (E[]) new Object[arr.length + 1];
                for (int i = index; i < size; i++) {
                    arr2[i + 1] = arr[i];
                }
                arr2[index] = (E) element;
                for (int i = 0; i < index; i++) {
                    arr2[i] = arr[i];
                }
                arr = arr2;
                size++;
            } else {
                arr[index] = (E) element;
                size++;
            }
        }
    }

    /**
     * Clears the size and array
     */
    @Override
    public void clear() {
        size = 0;
        arr = (E[]) new Object[10];
    }

    /**
     * Removes element from list based on index
     *
     * @param index
     * @return The object that was removed
     */
    @Override
    public Object remove(int index) {
        if (index >= size || isEmpty()) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        } else {
            resize();
            E obj = arr[index];
            E arr2[] = (E[]) new Object[arr.length];
            for (int i = index; i < size; i++) {
                arr2[i] = arr[(i + 1)];
            }
            for (int i = 0; i < index; i++) {
                arr2[i] = arr[i];
            }
            arr = arr2;
            size--;
            return obj;
        }
    }

    /**
     * Removes a specific element from the list
     *
     * @param o
     * @return boolean
     */
    @Override
    public boolean remove(Object o) {
        if (!isEmpty()) {
            for (int i = 0; i < size; i++) {
                if (arr[i].equals(o)) {
                    remove(i);
                    return true;
                }
            }
        }
        return false;

    }

    /**
     * Returns the size of the list
     *
     * @return int
     */
    @Override
    public int size() {
        return size;
    }

    private void resize() {
        if (size >= arr.length - 2) {
            E arr2[] = (E[]) new Object[(arr.length * 2)];
            moveArray(arr2);
        } else if (Math.floor(arr.length / 4) > size) {
            E arr2[] = (E[]) new Object[(arr.length / 2)];
            moveArray(arr2);
        }
    }

    private void moveArray(E[] arr2) {
        for (int i = 0; i < size; i++) {
            arr2[i] = arr[i];
        }
        arr = arr2;
    }

    @Override
    public String toString() {
        if (isEmpty()) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(arr[i]).append(",");
        }
        sb.deleteCharAt(sb.lastIndexOf(",")).append("]");
        return sb.toString();
    }

    /**
     * Checks to see if size is empty
     *
     * @return boolean
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object[] toArray(Object[] a) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean containsAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean addAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean addAll(int index, Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean removeAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public boolean retainAll(Collection c) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object get(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public Object set(int index, Object element) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ListIterator listIterator() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public ListIterator listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

}
