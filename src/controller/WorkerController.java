package controller;

import java.util.LinkedList;

import animals.Animal;
import employee.Worker;
import enclosure.*;
import simulation.EventListener;

public class WorkerController extends Controller implements EventListener{

	LinkedList<Enclosure> listEnclosures;
	
	public WorkerController(LinkedList<Enclosure> listEnclosures) {
		this.listEnclosures=listEnclosures;
	}

	private Worker worker=null;

	public Worker getWorkerSelec() {
		return worker;
	}

	public void setWorkerSelec(Worker worker) {
		this.worker = worker;
	}
	
	
	public void checkAndCleanEnclosure(Enclosure enclosure) {
		EnumCleanliness clean = this.worker.examinEnclosure(enclosure);	
		if(clean == EnumCleanliness.CLEAN) {
			System.out.println("Déja clean");
			return;
		}
		else {
			System.out.println("Je nettoie");
			this.worker.washEnclosure(enclosure);
		}
	}
	
	
	
	
	public void transferAnimal(int animal,Enclosure enclosureFrom, Enclosure enclosureTo) {
		
		Animal moveAnimal=enclosureFrom.researchAnimal(animal);
		enclosureFrom.retireAnimal(animal);
		
		enclosureTo.addAnimal(moveAnimal);
		
		
	}
	
	
	@Override
	public void update(String eventType) {
		// TODO Auto-generated method stub
		if(eventType == "checkEnclosure") {
		}
		else if(eventType == "transferAnimal") {
			
		}
		
	}

}
