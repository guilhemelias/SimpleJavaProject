package controller;
import animals.*;
import creator.Creator;
import simulation.EventListener;

public class AnimalController extends Controller implements EventListener{
	
	private Animal animal=null;

	
	public void setAnimalSelect(Animal animal) {
		this.animal=animal;
	}
	public Animal getAnimalSelect() {
		return this.animal;
		
	}
	
	public void comportment() {
		
	}
	
	public void cry() {
		this.animal.cry();
	}
	
	public void wakeUp(){
		this.animal.wakeUp();		
	}
	
	public void asleep(){
		this.animal.fallAsleep();		
	}
	
	public void sick() {
		this.animal.sick();
	}
	
	public void starving() {
		this.animal.starving();
	}
	
	
	public void makeChild() {
		if(this.animal.isGender() == true) {
		
			String  babyClass = this.animal.getClass().getName();
			
			
			
			
		}
		else {
			return;
		}
		
	}
	
	
	@Override
	public void update(String eventType) {
		// TODO Auto-generated method stub
		System.out.println("JAI FAIM");
		
	}

}
