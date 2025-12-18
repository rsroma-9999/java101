package Act3;

public class Alerts implements Executable {

	@Override
	public void run() {
		System.out.println("*Invalid option! Please retry.");
	}
	
	@Override
	public void stop() {
		System.out.println("Exit program.");
	}
	
}
