package com.collection;

public class ArrayList<E> {
    private int size = 0;
    private int capacity = 10;
    private Object[] array = new Object[capacity];

    public void add(E element, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法,合法的插入位置为:0 ~ " + size);
        for (int i = size; i > index; i--) array[i] = array[i - 1];
        array[index] = element;
        size++;
    }
}
