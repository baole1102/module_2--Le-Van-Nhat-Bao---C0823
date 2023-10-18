package ss9_automated_testing_and_tdd.exc.bt1;

public class MyListTest   {
    public static class Student extends MyList {
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
        Student student = new Student(1,"Le Van Nhat Bao");
        Student student1 = new Student(2, "Le Van Do");
        Student student2 = new Student(3, "Tran Kim Tieu Vi");

        MyList<Student> studentMyList = new MyList<>();
        studentMyList.add(0,student);
        studentMyList.add(1,student1);
        studentMyList.add(2,student2);
        for (int i = 0; i < studentMyList.size();i++){
            Student student3 = studentMyList.get(i);
            System.out.println(student3.getId());
            System.out.println(student3.getName());
        }
    }
}
