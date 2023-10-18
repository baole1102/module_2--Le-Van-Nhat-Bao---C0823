package ss9_automated_testing_and_tdd.exc.bt1;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {

    }

    private void ensureCapa() {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(int index, E e) {
        for (int i = size - 1; i >= index; i--) {
            elements[i + 1] = elements[i];
        }
        elements[index] = e;
        size++;
    }

    public E remove(int index) {
        checkIndex(index);
        E e = (E) elements[index];
        for (int j = index; j < size - 1; j++) {
            elements[j] = elements[j + 1];
        }
        elements[size - 1] = null;
        size--;
        return e;
    }

    public void checkIndex(int index) {
        if (index < 0 || index > elements.length) {
            throw new IndexOutOfBoundsException("index" + index + "out of bound");
        }
    }

    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    public int size() {
        return this.size;
    }
//    public E clone (){
////    return
//    }
}
