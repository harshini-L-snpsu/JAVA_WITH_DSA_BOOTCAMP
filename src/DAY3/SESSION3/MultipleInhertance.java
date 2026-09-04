package DAY3.SESSION3;
class Father {
    void fathertone() {
        System.out.println("Loud");
    }
}

interface Mother {
    void mothertone();
}

class Child extends Father implements Mother {

    public void mothertone() {
        System.out.println("Soft");
    }

    
public class MultipleInhertance {
    public static void main(String[] args){
        Child obj = new Child();

        obj.fathertone();
        obj.mothertone();
    }
}
    System.out.println("Father");
    System.out.println("Mother");
    }
}
