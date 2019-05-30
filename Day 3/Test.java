import java.util.ArrayList;
import java.util.Stack;
import java.util.HashMap;
public class Test{
    public static void main(String args[]){
        ArrayList<Integer> testList = new ArrayList<>();
        Stack<Integer> testStack = new Stack<>();
        HashMap<Integer,String> testHashMap = new HashMap<>();
        testList.add(1);
        testList.add(2);
        testList.add(3);
        testList.remove(1);
        System.out.println(testList);
        testStack.push(1);
        testStack.push(2);
        testStack.push(3);
        testStack.pop();
        System.out.println(testStack);
        testHashMap.put(1,"a");
        testHashMap.put(2,"b");
        testHashMap.put(3,"c");
        System.out.println(testHashMap);
    }
}