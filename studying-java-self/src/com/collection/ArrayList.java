package com.collection;

public class ArrayList<E> {
    private int size = 0;
    private int capacity = 10;
    private Object[] array = new Object[capacity];

    public void add(E element, int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法,合法的插入位置为:0 ~ " + size);

        ensureCapacity(size + 1);

        if (index < size) {
            System.arraycopy(array, index, array, index + 1, size - index);
        }
        array[index] = element;
        size++;
    }

    private void ensureCapacity(int minCapacity) {
        if (minCapacity > capacity) {
            int newCapacity = Math.max(capacity << 1, minCapacity);
            Object[] newArray = new Object[newCapacity];
            System.arraycopy(array, 0, newArray, 0, size);
            array = newArray;
            capacity = newCapacity;
        }
    }

    @SuppressWarnings("unchecked")   //屏蔽未经检查警告
    public E remove(int index){   //删除对应位置上的元素，注意需要返回被删除的元素
        E e = (E) array[index];   //因为存放的是Object类型，这里需要强制类型转换为E
        for (int i = index; i < size; i++)   //从前往后，挨个往前搬一位
            array[i] = array[i + 1];
        size--;    //删完记得将size--
        return e;
    }

    @SuppressWarnings("unchecked")
    public E get(int index){
        if(index < 0 || index > size - 1)   //在插入之前同样要进行范围检查
            throw new IndexOutOfBoundsException("非法的位置，合法的位置为：0 ~ "+(size - 1));
        return (E) array[index];   //直接返回就完事
    }

    public int size(){   //获取当前存放的元素数量
        return size;
    }

    @Override
    public String toString() {
        if (size == 0) return "[]";

        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(array[i]);
            if (i != size - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }
}
