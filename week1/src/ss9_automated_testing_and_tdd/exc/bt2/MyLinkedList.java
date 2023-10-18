package ss9_automated_testing_and_tdd.exc.bt2;

public class MyLinkedList<E> {
    private Node head;
    private int numNodes = 0;

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
       Node newElement = new Node(e);
       Node temp = head;
       if (temp == null){
           temp = newElement;
       }else if (temp.next != null){
           temp.next = newElement;
       }
        numNodes ++;
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }
}
