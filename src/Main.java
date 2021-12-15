import controller.Controller;
import employee.Gender;
import enclosure.Aviary;
import zoo.Zoo;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		
		controller.createZoo("Zozo",40,"Gerard",34,Gender.MALE);
		System.out.println(controller.getZoo());
		controller.getZoo().startSimulation();
		
		controller.getZoo().addEnclosure(new Aviary("test",4,4,4));
		System.out.println(controller.getZoo().getListEnclosures().getFirst().getClass().getSimpleName());
		
	}
	
}
