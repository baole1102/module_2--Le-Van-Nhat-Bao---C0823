package ss9_automated_testing_and_tdd.exc.bt2;

import ss9_automated_testing_and_tdd.exc.bt1.MyList;

import java.util.Arrays;

public class MyLinkedList<E> {
    public class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
    private Node head;
    public int numNodes = 0;

    public MyLinkedList() {
        head = new Node(numNodes);
        numNodes++;
    }

    public void add(int index, E e) {
        Node temp = head;
        Node result;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        result = temp.next;
        temp.next = new Node(e);
        temp.next.next = result;
        numNodes++;
    }

    public void addFirst(E e) {
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numNodes++;
    }

    public void addLast(E e) {
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = new Node(e);
        numNodes++;
    }

    public E remove(int index) {
        if (index < 0 || index > numNodes) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        Node temp = head;
        Object data;
        if (index == 0) {
            data = temp.data;
            temp = temp.next;
        } else {
            for (int i = 0; i < index - 1 && temp.next != null; i++) {
                temp = temp.next;
            }
            data = temp.next.data;
            temp.next = temp.next.next;
            numNodes++;
        }
        return (E) data;
    }

    public Object get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp.data;
    }

    public E getFirst() {
        Node temp = head;
        return (E) temp;
    }

    public E getLast() {
        Node temp = head;
        for (int i = 0; i < numNodes - 1; i++) {
            temp = temp.next;
        }
        Node last = temp.next;
        return (E) last;
    }

    public void clear() {
        Node temp = head;
        if (temp != null) {
            return;
        } else {
            numNodes = 0;
        }
    }

    public boolean remove(E e) {
        if (head.data.equals(e)) {
            remove(0);
        } else {
            Node temp = head;
            while (temp.next != null) {
                if (temp.next.data.equals(e)) {
                    temp.next = temp.next.next;
                    numNodes--;
                    return true;
                }
            }
        }
        return false;
    }

    public MyLinkedList<E> clone() {
        if (numNodes == 0) {
            throw new IllegalArgumentException("Error numNodes: " + numNodes);
        }
        MyLinkedList<E> returnMyLinkList = new MyLinkedList<>();
        Node temp = head;
        returnMyLinkList.addFirst((E) temp);
        temp = temp.next;
        while (temp != null) {
            returnMyLinkList.addLast((E) temp.data);
            temp = temp.next;
        }
        return returnMyLinkList;
    }

    public int indexOf(E e) {
        Node temp = head;
        while (temp.next != null) {
            for (int i = 0; i < numNodes; i++) {
                if (temp.getData().equals(e)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public boolean contains(E e) {
        Node temp = head;
        while (temp.next != null) {
            if (temp.next.equals(e)) {
                return true;
            }
            temp = temp.next;
        }
        return false;
    }

    public int size() {
        return numNodes;
    }

}
