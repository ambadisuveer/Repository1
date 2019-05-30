public class Parse1{
    public static void main(String args[]){
        int i;
        double d;
        String S = "123";
        i = Integer.parseInt(S);
        System.out.println(i+1);
        d = Double.parseDouble(S);
        System.out.println(d+1);
        System.out.println(Integer.toBinaryString(123));
        System.out.println(Integer.toOctalString(123));
        System.out.println(Integer.toHexString(123));
    }
}