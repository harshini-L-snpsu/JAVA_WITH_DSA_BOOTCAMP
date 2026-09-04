package DAY10.SESSION1;
import java.util.Stack;
public class BaseBallGame {
    public static Stack<Integer> game(String[] game){
        Stack<Integer> stack= new Stack<>();
        for(String value:game){
            if(value.equals("+")){
                int sum=stack.get(stack.size()-1)+stack.get(stack.size()-2);
                stack.push(sum);
            } else if (value.equals("D")) {
                int sum = 2 * stack.peek();
                stack.push(sum);
            } else if (value.equals("C")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(value));
            }
        }
        return stack;
    }
    public static void main(String[] args) {
        String[] game1={"5","2","C","D","+"};
        Stack<Integer> stack = new Stack<>();
        stack= game(game1);
        int sumOfStack = 0;
        for(int i : stack){
            sumOfStack +=i;
        }
        System.out.println("Sum of stack: " + sumOfStack);
    }
}
