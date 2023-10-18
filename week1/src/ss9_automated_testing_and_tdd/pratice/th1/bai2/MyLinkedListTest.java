package ss9_automated_testing_and_tdd.pratice.th1.bai2;

public class MyLinkedListTest {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList a = new MyLinkedList(10);
        a.addFirst(11);
        a.addFirst(12);
        a.addFirst(13);

        a.add(4,9);
        a.add(4,9);
        a.printList();
    }
}
