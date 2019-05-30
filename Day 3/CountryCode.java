import java.util.HashMap;
import java.util.Scanner;
import java.io.FileReader;
public class CountryCode{
    public static void main(String args[]){
        FileReader file = null;
        try{
            file = new FileReader("CountryCode.txt");
        }catch(Exception e){
            System.err.println("File not found");
        }
        Scanner sc = new Scanner(file);
        HashMap<String,String> countryHashMap = new HashMap<>();
        while(sc.hasNextLine()){
            try{
                countryHashMap.put(sc.next(),sc.next());
            }catch(Exception e){
                System.err.println("Corresponding Country Code not found");
            }
        }
        System.out.println(countryHashMap);
    }
}