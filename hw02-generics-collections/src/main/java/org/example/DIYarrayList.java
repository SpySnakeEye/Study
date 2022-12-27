package org.example;

import java.util.*;

public class DIYarrayList<T> implements List<T> {
    private int size = 0;
    private int capacity = 10;
    private Object[] elementData = new Object[capacity];

    public boolean add(T element) {
        if (element == null) {
            return false;
        } else {
            if (size == capacity) {
                capacity = (int) (capacity * 1.5);
                Object[] newElements = new Object[capacity];
                for (int i = 0; i < elementData.length; i++) {
                    newElements[i] = elementData[i];
                }
                elementData = newElements;
            }
            elementData[size] = element;
            size++;
            return true;
        }
    }

    @Override
    public String toString() {
        Object[] ElementsForPrint = new Object[size];
        for (int i = 0; i < size; i++) {
            ElementsForPrint[i] = elementData[i];
        }
        return Arrays.toString(ElementsForPrint);
    }

    @Override
    public int size() {
        if (size > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else {
            return size;
        }
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ListIterator<T>() {
            int i = 0;

            @Override
            public boolean hasNext() {
                return size > i;
            }

            @Override
            public T next() {
                return (T) elementData[i++];
            }

            @Override
            public boolean hasPrevious() {
                throw new UnsupportedOperationException();
            }

            @Override
            public T previous() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int nextIndex() {
                throw new UnsupportedOperationException();
            }

            @Override
            public int previousIndex() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }

            @Override
            public void set(T t) {
                elementData[i - 1] = t;
            }

            @Override
            public void add(T t) {
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        Object[] ElementsForSort = new Object[size];
        for (int i = 0; i < size; i++) {
            ElementsForSort[i] = elementData[i];
        }
        return ElementsForSort;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        throw new UnsupportedOperationException();
    }

    private Object[] grow(int i) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T get(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T set(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void add(int index, T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T remove(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException();
    }

    @Override
    public ListIterator<T> listIterator(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException();
    }
}
