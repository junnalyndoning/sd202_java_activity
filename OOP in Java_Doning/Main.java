public class Main{
    public static void main(String[] args){
        FourWheels rap = new FourWheels("Raptor");
        FourWheels spo = new FourWheels("Sports Car");
        System.out.println( rap.getName() + " is special because it wears extra-wide fenders, long-travel suspension, big tires, and the high-performance demeanor of a Baja-bashing race truck.");
        System.out.println();
        System.out.println( spo.getName()+ " is unique because it is a small, high-powered automobile with long, low lines, usually seating two persons.");
        System.out.println();
        TwoWheels tw = new TwoWheels();
        
        tw.myname();
        tw.describe();
    }
}