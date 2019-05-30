public class Driver{
    public static void main(String args[]){
        Sample<Integer> sampleInteger = new Sample<>(65);
        System.out.println(sampleInteger);
        Sample<String> sampleString = new Sample<>("Hello");
        System.out.println(sampleString);
        Sample1<Integer,String> sample1Integer = new Sample1<>(5,"Integer");
        System.out.println(sample1Integer);
    }
}