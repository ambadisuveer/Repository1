public class Exception1{
    public static void main(String args[]){
        int arr[] = new int[5];
        try{
            arr[5]=10;
        }catch(Exception e){
            System.err.println(e);
        }finally{//Not mandatory
            System.out.println("Done");
        }
    }
}