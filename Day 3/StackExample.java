import java.util.Stack;
public class StackExample{
    public static void main(String args[]){
        Stack<Integer> integerStack = new Stack<>();
        integerStack.push(1);
        integerStack.push(2);
        integerStack.push(3);
        integerStack.push(4);
        System.out.println(integerStack);
        integerStack.pop();
        System.out.println(integerStack);
    }
}