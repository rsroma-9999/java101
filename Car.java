package Act6;


public class Car extends Vehicle implements Refuelable {

    public Car(String brand, int numberOfWheels) {
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