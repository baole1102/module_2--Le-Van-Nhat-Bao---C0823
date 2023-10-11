package ss4_OOP.pratice;
    public class Inheritance extends Geometric {
        private int id;
        public Inheritance(String name, int age, double height,int id) {
            super(name, age, height);
            this.id = id;
        }
        @Override
        public String getName(){
            return super.getName();
        }
        public int getId(){
            return this.id;
        }
        public int getAge(){
            return super.getAge();
        }
        public double getHeight (){
            return super.getHeight();
        }
        @Override
        public String toString(){
            return "I am a Circle"+ this.id;
        }
}

