package DAY3.SESSION1;
class Student {
    String name;
    int age;
    String course;
    Student(){
        name = "Harshini";
        age = 19;
        course = "DAS";
    }
    Student(String name , int age , String course){
        this.name = name;
        this.age = age;
        this.course = course;
        }
    void view(){
        System.out.println(name+" " +age+ " " +course);
        }
    }
    class Child extends Student{
        public Child(){
            super("Achu", 18, "DAS");
        }
        void view(){
            System.out.println(name+" " +age+ " " +course);
        }
}

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s = new Student();
        s.view();
        Child c = new Child();
        c.view();
    }
}
