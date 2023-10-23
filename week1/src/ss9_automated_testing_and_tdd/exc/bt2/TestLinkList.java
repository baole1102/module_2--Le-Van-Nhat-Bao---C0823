package ss9_automated_testing_and_tdd.exc.bt2;

import ss9_automated_testing_and_tdd.exc.bt1.MyListTest;

public class TestLinkList {
    public static class Student  {
        private int id;
        private String name;

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public static void main(String[] args) {

        MyLinkedList<Student> myLinkedList = new MyLinkedList<>();
        Student student1 = new Student(1, "Bao");
        Student student2 = new Student(2, "Do");
        Student student3 = new Student(3, "Vi");
        Student student4 = new Student(4, "Phuong");
          myLinkedList.addFirst(student1);
          myLinkedList.addFirst(student2);
          myLinkedList.add(2,student4);
          myLinkedList.remove(2);


        for (int i = 0; i < myLinkedList.size(); i++) {
            Student student = (Student) myLinkedList.get(i);
            System.out.println(student.getName());
        }
    }
}
