package Act6;


public class Truck extends Vehicle implements Refuelable {

    public Truck(String brand, int numberOfWheels) {
    	super(numberOfWheels, brand);
    }

    @Override
    public void startEngine() {
        System.out.println("Starting engine of " + brand + "...");
    }

    @Override
    public void refuel() {
        System.out.println("Refueling " + brand + " to full tank...");
    }

}
