package com.collection;

public class LinkedList<E> {
    //链表的头结点，用于连接之后的所有结点
    private final Node<E> head = new Node<>(null);
    private int size = 0;   //当前的元素数量还是要存一下，方便后面操作

    private static class Node<E> {  //结点类，仅供内部使用
        E element;   //每个结点都存放元素
        Node<E> next;   //以及指向下一个结点的引用

        public Node(E element) {
            this.element = element;
        }
    }

    public void add(E element, int index){
        if(index < 0 || index > size)
            throw new IndexOutOfBoundsException("插入位置非法，合法的插入位置为：0 ~ "+size);
        Node<E> prev = head;
        for (int i = 0; i < index; i++)
            prev = prev.next;
        Node<E> node = new Node<>(element);
        node.next = prev.next;
        prev.next = node;
        size++;
    }

    public E remove(int index){
        if(index < 0 || index > size - 1)   //同样的，先判断位置是否合法
            throw new IndexOutOfBoundsException("删除位置非法，合法的删除位置为：0 ~ "+(size - 1));
        Node<E> prev = head;
        for (int i = 0; i < index; i++)   //同样需要先找到前驱结点
            prev = prev.next;
        E e = prev.next.element;   //先把待删除结点存放的元素取出来
        prev.next = prev.next.next;  //可以删了
        size--;   //记得size--
        return e;
    }

    public E get(int index){
        if(index < 0 || index > size - 1)
            throw new IndexOutOfBoundsException("非法的位置，合法的位置为：0 ~ "+(size - 1));
        Node<E> node = head;
        while (index-- >= 0)   //这里直接让index减到-1为止
            node = node.next;
        return node.element;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        Node<E> node = head.next;   //从第一个结点开始，一个一个遍历，遍历一个就拼接到字符串上去
        while (node != null) {
            builder.append(node.element).append(" ");
            node = node.next;
        }
        return builder.toString();
    }
}