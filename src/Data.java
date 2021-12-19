import animals.*;
import controller.Controller;
import employee.Gender;
import enclosure.Aviary;
import enclosure.Enclosure;

public class Data {

	private Controller controller = new Controller();
	
	
	
	public void createZoo() {
		controller.createZoo("Zozo",40,"Gerard",34,Gender.MALE);
		
		
		controller.getZoo().addEnclosure(new Enclosure("hey1", 40, 12));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf1", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf2", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf3", 1, 12, 2, false));
		
		controller.getZoo().addEnclosure(new Aviary("hey2", 20, 2,5));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Auk("Auk4", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Auk("Auk5", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Auk("Auk6", 1, 12, 2, false));
		
		
		controller.getZoo().addEnclosure(new Enclosure("hey3", 35, 5));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf7", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf8", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf9", 1, 12, 2, false));
		
		controller.getZoo().addEnclosure(new Enclosure("hey4", 23, 7));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf10", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf11", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf12", 1, 12, 2, false));
		
		
		controller.getZoo().addEnclosure(new Enclosure("hey5", 67, 15));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf13", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf14", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf15", 1, 12, 2, false));
		
		controller.getZoo().addEnclosure(new Enclosure("hey6", 120, 22));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf16", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf17", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf18", 1, 12, 2, false));
		
		controller.getZoo().addEnclosure(new Enclosure("hey7", 78, 16));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf19", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf20", 1, 12, 2, false));
		controller.getZoo().getListEnclosures().getLast().addAnimal(new Wolf("Wolf21", 1, 12, 2, false));
		
	}
	
	
	

	public Controller getController() {
		return controller;
	}

	public void setController(Controller controller) {
		this.controller = controller;
	}
	
	
	
}
