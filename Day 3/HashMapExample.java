import java.util.HashMap;
public class HashMapExample{
    public static void main(String args[]){
    HashMap<Integer,String> songHashMap = new HashMap<>();//LinkedHashMap is used to get in order
    songHashMap.put(1,"The Zone");
    songHashMap.put(2,"The Hills");
    songHashMap.put(3,"Thursday");
    System.out.println(songHashMap);
    }
}