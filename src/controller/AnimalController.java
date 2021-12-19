package controller;
import animals.*;
import creator.Creator;
import simulation.EventListener;

public class AnimalController extends Controller implements EventListener{
	
	
	
	public void comportment() {
		
	}
	
	public void cry() {
		this.animalSelect.cry();
	}
	
	public void wakeUp(){
		this.animalSelect.wakeUp();		
	}
	
	public void asleep(){
		this.animalSelect.fallAsleep();		
	}
	
	public void sick() {
		this.animalSelect.sick();
	}
	
	public void starving() {
		this.animalSelect.starving();
	}
	
	
	public void makeChild() {
		if(this.animalSelect.isGender() == true) {
		
			String  babyClass = this.animalSelect.getClass().getName();
			
			
			
			
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
