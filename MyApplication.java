package Act6;


public class MyApplication {

		public static void main(String[] args) {
			Car car = new Car("Nissan", 4);
	        Truck truck = new Truck("Ford", 6);

	        System.out.println("Car: " + car.getBrand() + ", " + car.getNumberOfWheels() + " wheeler:");
	        car.startEngine();          
	        car.refuel();               
	       	         
	        System.out.println();

	        System.out.println("Truck: " + truck.getBrand() + ", " + truck.getNumberOfWheels() + " wheeler:");
	        truck.startEngine();        
	        truck.refuel();             
	        
	        System.out.println();
	        
	        destroyVehicle(car);
	        destroyVehicle(truck);
	        
	    }

	    public static void destroyVehicle(Vehicle vehicle) {
	        vehicle.destroy();
	    }
	    
	}
