import controller.*;
import controller.Controller;
import controller.EnclosureController;
import employee.Gender;
import enclosure.Aviary;
import zoo.Zoo;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = new Controller();
		EnclosureController enclosureController = new EnclosureController();
		AnimalController animalController = new AnimalController();
		
		controller.createZoo("Zozo",40,"Gerard",34,Gender.MALE);
		System.out.println(controller.getZoo());
		
		
		
		
		
		controller.getZoo().getClock().subscribe("starve",animalController );
		controller.getZoo().getClock().subscribe("tired",animalController );
		controller.getZoo().getClock().subscribe("sickness",animalController );
		controller.getZoo().getClock().subscribe("baby",animalController );
		controller.getZoo().getClock().subscribe("makeSound",animalController );
		
		controller.getZoo().getClock().subscribe("cleanliness",enclosureController );
		
		
		
		controller.getZoo().startSimulation();
		
		
		
		
		
		
		controller.getZoo().addEnclosure(new Aviary("test",4,4,4));
		System.out.println(controller.getZoo().getListEnclosures().getFirst().getClass().getSimpleName());
		
	}
	
}
