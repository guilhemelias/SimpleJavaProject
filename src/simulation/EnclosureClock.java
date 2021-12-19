package simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author Guilhem
 *Clock class for enclosures events
 */
public class EnclosureClock extends TimerTask {

	
	Map<String, List<EventListener>> enclosureListeners = new HashMap<>();
	
	

    Timer timer = new Timer();
	
    /**
     * @param operations
     * first constructor which take operations list for the eventlistener
     */
    public EnclosureClock(String... operations) {
        for (String operation : operations) {
        	System.out.println(operation);
            this.enclosureListeners.put(operation, new ArrayList<>());
        }
    }
    
    /**
     * @param listener
     * second constructor for sheduled tasks
     */
    public EnclosureClock(Map<String, List<EventListener>> listener) {
    	this.enclosureListeners = listener;
    }
	
	/**
	 *run simulation method
	 */
	@Override
	public void run() {
		int delay = (2 + new Random().nextInt(8)) * 1000;
        timer.schedule(new EnclosureClock(this.enclosureListeners), delay);
        
        
        //CODE A METTRE

        if(new Random().nextInt(10) < 4) {
        	this.notify("cleanliness");
        }
		
	}
	
	/**
	 * stop simulation method
	 */
	public void stop() {
    	this.cancel();
    	this.timer.cancel();
    }
	
	
	
	/**
	 * subscribe listeners to events
	 * @param eventType
	 * @param listener
	 */
	public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = enclosureListeners.get(eventType);
        users.add(listener);
    }

    /**
     * unsubscribe listeners to events
     * @param eventType
     * @param listener
     */
    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = enclosureListeners.get(eventType);
        users.remove(listener);
    }
    
    /**
     * notify listeners from an event that they are subscribes
     * @param eventType
     */
    public void notify(String eventType) {
       // this.workerListeners.forEach((k,v)->System.out.println("Key : " + k + " Value : " + v));

        List<EventListener> users = enclosureListeners.get(eventType);
        
        for (EventListener listener : users) {
        	
			listener.update(eventType);
        }
    }

}
