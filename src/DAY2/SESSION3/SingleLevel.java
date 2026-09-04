package DAY2.SESSION3;
class Father{
    String name;
    void skill(){
        System.out.println("Riding a bike");
    }
}
class child extends Father{
    String name;
    void skill(){
        System.out.println("Crashing the bike");
    }
}
public class SingleLevel {
    public static void main(String[] args){
        child c = new child();
        c.skill();
        Father f = new child();
        f.skill();
    }
}
