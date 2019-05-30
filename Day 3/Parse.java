public class Parse{
    public static void main(String args[]){
        String n1 = "123";
        int num1 = Integer.parseInt(n1);
        num1 = num1+1;
        System.out.println(num1);
        n1 = "12.4";
        double num2 = Double.parseDouble(n1);
        num2 = num2+0.3;
        System.out.println(num2);
        String binaryNum = Integer.toBinaryString(num1);//Integer to binary
        System.out.println(binaryNum);
        num1 = Integer.parseInt(binaryNum,2);//2 specifies binary
        System.out.println(num1);
        num1 = Integer.parseInt("A",16);
        System.out.println(num1);
    }
}