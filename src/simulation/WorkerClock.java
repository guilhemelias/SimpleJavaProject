package simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WorkerClock extends TimerTask{

	Map<String, List<EventListener>> workerListeners = new HashMap<>();
	
	

    Timer timer = new Timer();
	
	
    
    
    public WorkerClock(String... operations) {
        for (String operation : operations) {
            this.workerListeners.put(operation, new ArrayList<>());
        }
    }
    
    public WorkerClock(Map<String, List<EventListener>> listener) {
    	this.workerListeners = listener;
    }
    
    
    
    
    
    
	@Override
	public void run() {
		int delay = (5 + new Random().nextInt(8)) * 1000;
        timer.schedule(new WorkerClock(this.workerListeners), delay);
        
        
        //CODE A METTRE

        if(new Random().nextInt(10) < 6) {
        	this.notify("checkEnclosure");
        }
        else {
        	this.notify("checkAnimals");
        }
        
		
	}
	
	
	
	public void stop() {
    	this.cancel();
    	this.timer.cancel();
    }
	
	
	
	public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = workerListeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = workerListeners.get(eventType);
        users.remove(listener);
    }
    
    public void notify(String eventType) {
       // this.workerListeners.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

        List<EventListener> users = workerListeners.get(eventType);
        
        for (EventListener listener : users) {
        	
			listener.update(eventType);
        }
    }

}
