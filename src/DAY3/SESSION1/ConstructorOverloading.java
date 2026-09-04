package DAY3.SESSION1;
class Shape{
    int width;
    int height;
    int depth;

    //Default Constructor
    public Shape(){
    }
    //store all dimensions

    Shape(int width ,int height ,int depth){
        this.width =width;
        this.height=height;
        this.depth=depth;
    }
    //store this side

    Shape(int side){
        width = side;
        height = side;
        depth = side;
    }
}
public class ConstructorOverloading {
    public static void main(String[] args) {
        Shape s = new Shape(10,20,30);
        System.out.println("width:" +s.width);
        System.out.println("height:" +s.height);
        System.out.println("depth:" +s.depth);
    }
}
