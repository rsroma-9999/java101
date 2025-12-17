package Act3;

public class alerts implements executable {

	@Override
	public void run() {
		System.out.println("*Invalid option! Please retry.");
	}
	
	@Override
	public void stop() {
		System.out.println("Closing program...");
	}
	
}
