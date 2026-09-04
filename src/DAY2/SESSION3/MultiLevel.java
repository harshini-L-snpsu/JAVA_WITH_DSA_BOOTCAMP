package DAY2.SESSION3;
class GrandFather{
    String name;
    void skill(){
        System.out.println("Story Telling");
    }
}
class Father extends GrandFather{
    String name;
    void skill(){
        System.out.println("Ride");
    }
}
class Son extends Father{
    String name;
    void skill(){
        System.out.println("Sleeping");
    }
}


public class MultiLevel {
    public static void main(String[]args){
        GrandFather g = new GrandFather();
        g.skill();
        Father f = new Father();
        f.skill();
        Son s = new Son();
        s.skill();
    }
    
}
