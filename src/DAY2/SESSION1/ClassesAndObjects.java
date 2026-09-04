package DAY2.SESSION1;
class Student{
    // data
    // functions
    int data;

    public int add(int a, int b){
        return a + b;
    }
}
public class ClassesAndObjects {
    public static void main(String[]args){
//Instance of the class
        Student s= new Student();
        System.out.println("The Sum is: "+s.add(10,20));
    }
}

