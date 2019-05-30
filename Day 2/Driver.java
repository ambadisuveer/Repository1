public class Driver{
    public static void main(String args[]){
        Car suzuki = new Car();
        Car honda = new Car("Honda","Red",4);
        suzuki.setColor("Yellow");
        suzuki.setCompany("Suzuki");
        suzuki.setSeat(8);
        System.out.println(suzuki.getCompany()+" "+suzuki.getColor()+" "+suzuki.getNoOfSeats());
        honda.print();
    }
}