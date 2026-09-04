package DAY3.SESSION2;
class Home{
    interface window{
        void onClose();
        private void play1(){
        }
        static void play2(){
        }
        default void play(){
        }
    }
}
class app implements Home.window{
    @Override
    public void onClose(){
        System.out.println("Window is Closed");
    }
}
public class NestedInterface {
    public static void main(String[] args) {
        Home.window obj = new app();
        obj.onClose();
    }
    
}
