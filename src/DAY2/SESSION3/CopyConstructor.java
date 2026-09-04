package DAY2.SESSION3;
class Laptop{
    String brand;
    int ramSize;
    public Laptop(String brand, int ramSize){
        this.brand = brand;
        this.ramSize =  ramSize;
    }
    public Laptop(Laptop obj){
        this.brand=obj.brand;
        this.ramSize=obj.ramSize;
    }
    //brand1 = 10
}
public class CopyConstructor {
    public static void main(String[]args){
        Laptop original= new Laptop("Dell", 16);
        Laptop copy= new Laptop(original);
        System.out.println(copy.brand +" " + copy.ramSize);
    }
}
