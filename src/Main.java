import controller.*;
import controller.Controller;
import controller.EnclosureController;
import employee.Gender;
import enclosure.Aviary;
import enclosure.Enclosure;
import zoo.Zoo;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Controller controller = null;
		Data data = new Data();
		
		boolean ans = true;
		
		
		while(ans) {
			if(controller==null) {
				//Récup valeur zoo
				System.out.println("Nouvelle partie de Zoo ! ");

				
				data.createZoo();
				controller = data.getController();
				
				controller.getZoo().getClock().subscribe("starve",controller );
				controller.getZoo().getClock().subscribe("tired",controller );
				controller.getZoo().getClock().subscribe("sickness",controller );
				controller.getZoo().getClock().subscribe("baby",controller );
				controller.getZoo().getClock().subscribe("makeSound",controller );
				
				controller.getZoo().getEnclosureClock().subscribe("cleanliness",controller );
				
				controller.getZoo().getWorkerClock().subscribe("checkEnclosure",controller );
				controller.getZoo().getWorkerClock().subscribe("transferAnimal",controller );
				controller.getZoo().getWorkerClock().subscribe("checkAnimals",controller );
				
				controller.getZoo().startSimulation();
				
			}else {
				System.out.println("/////////////////////////////////////////////////////////////////");
				System.out.println("//                                                             //");
				System.out.println("//                                                             //");
				System.out.println("//"+ controller.getZoo()+ "//");
				System.out.println("//");
				System.out.println("//");
				System.out.println("//");
				System.out.println("//");
				System.out.println("//");
				System.out.println("//                                                             //");
				System.out.println("//                                                             //");
				System.out.println("/////////////////////////////////////////////////////////////////");
			}
			
			
		}
		
		
				
		
		
		
		
		
		
		
		
		

		
		System.out.println(controller.getZoo().getListEnclosures().getFirst().getClass().getSimpleName());
		
	}
	
	
	
}
