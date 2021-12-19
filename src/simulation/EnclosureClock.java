package simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class EnclosureClock extends TimerTask {

	
	Map<String, List<EventListener>> enclosureListeners = new HashMap<>();
	
	

    Timer timer = new Timer();
	
    public EnclosureClock(String... operations) {
        for (String operation : operations) {
        	System.out.println(operation);
            this.enclosureListeners.put(operation, new ArrayList<>());
        }
    }
    
    public EnclosureClock(Map<String, List<EventListener>> listener) {
    	this.enclosureListeners = listener;
    }
	
	@Override
	public void run() {
		int delay = (2 + new Random().nextInt(8)) * 1000;
        timer.schedule(new EnclosureClock(this.enclosureListeners), delay);
        
        
        //CODE A METTRE

        if(new Random().nextInt(10) < 4) {
        	this.notify("cleanliness");
        }
		
	}
	
	public void stop() {
    	this.cancel();
    	this.timer.cancel();
    }
	
	
	
	public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = enclosureListeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = enclosureListeners.get(eventType);
        users.remove(listener);
    }
    
    public void notify(String eventType) {
       // this.workerListeners.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

        List<EventListener> users = enclosureListeners.get(eventType);
        
        for (EventListener listener : users) {
        	
			listener.update(eventType);
        }
    }

}
