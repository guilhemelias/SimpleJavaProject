package controller;
import animals.*;

public class AnimalController extends Controller{
	
	private Animal animal=null;
	
	public void setAnimalSelect(Animal animal) {
		this.animal=animal;
	}
	public Animal getAnimalSelect() {
		return this.animal;
		
	}
	
	
	public void makeChild() {
		if(this.getAnimalSelect().isGender() == true) {
		
			String  babyClass = this.getAnimalSelect().getClass().getName();
			
			
			
			
		}
		else {
			return;
		}
		
	}

}
