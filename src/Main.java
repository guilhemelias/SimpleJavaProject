import Controller.Controller;
import employee.Gender;
import enclosure.Aviary;
import zoo.Zoo;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		
		controller.createZoo("Zozo",40,"Gerard",34,Gender.MALE);
		System.out.println(controller.getZoo());
		//controller.getZoo().startSimulation();
		
		//zoo.addEnclosure(new Aviary("test",4,4,4));
		//System.out.println(zoo.getListEnclosures().getFirst().getClass().getSimpleName());
		
	}
	
}
