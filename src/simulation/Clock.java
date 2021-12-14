package simulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;


import Controller.*;


public class Clock extends TimerTask {
	
	private EnclosureController enclosureController;
	private AnimalController animalController ;
	Map<String, List<EventListener>> listeners = new HashMap<>();
	
	

    Timer timer = new Timer();
    

    @Override
    public void run() {
        int delay = (2 + new Random().nextInt(8)) * 1000;
        timer.schedule(new Clock(), delay);
        
        
        //CODE A METTRE

        if(new Random().nextInt(10) ==5) {
        	System.out.println("stop");
        	this.stop();
        }
        else {
        	System.out.println(delay);
        }
        
        
    }
    
    
    public void stop() {
    	this.cancel();
    	this.timer.cancel();
    }
    
    
    

    public Clock(String... operations) {
        for (String operation : operations) {
            this.listeners.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> users = listeners.get(eventType);
        users.remove(listener);
    }



}