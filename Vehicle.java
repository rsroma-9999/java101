package Act6;


public abstract class Vehicle {
    protected String brand;
    protected int numberOfWheels;
    
    public Vehicle(int numberOfWheels, String brand) {
        this.numberOfWheels = numberOfWheels;
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }
    
    public abstract void startEngine();

    public void destroy() {
        System.out.println("Driving " + brand + " at full speed..." + "Vehicle has been destroyed...");
    }
    
}
