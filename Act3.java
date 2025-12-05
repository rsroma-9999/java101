package Act3;

public class Act3 {
	
	public static void main(String[] args) {
		Car car1 = new Car();
		car1.setBrand("Ford Mustang");
		car1.setYear(1999);
		
		car1.checkout();
		
		Car car2 = new Car("Toyota Celica",2025);
		
		car2.checkout();
	}

}
