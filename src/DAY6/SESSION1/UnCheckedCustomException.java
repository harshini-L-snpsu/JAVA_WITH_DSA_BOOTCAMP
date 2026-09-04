package DAY6.SESSION1;
class MarksWrongException extends RuntimeException{
    public MarksWrongException(String message){
        super(message);
    }
}
public class UnCheckedCustomException {
    public static void marksCheck(int marks){
        if(marks<0|| marks>100){
            throw new MarksWrongException("Marks Wrong");
        }
        System.out.println("Valid Marks:" + marks);
    }
    public static void main(String[] args) {
        try{
            marksCheck(99);
        }catch(MarksWrongException e){
            System.out.println("Exception: "+e.getMessage());
        }
        System.out.println("Program Continues...");
    }
}
