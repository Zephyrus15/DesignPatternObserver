package fr.mds.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	private final List<Observer> observers = new ArrayList<Observer>();
	
	private int state;

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		notifyObservers();
	}
	
	public void attach(Observer observer) {
	    if (!observers.contains(observer)) {
	      this.observers.add(observer);
	    }
	  }

	  public void detach(Observer observer) {
	    if (observers.contains(observer)) {
	      this.observers.remove(observer);
	    }
	  }

	  protected void notifyObservers() {
	    for (Observer observer : observers) {
	      observer.update();
	    }
	  }
	
	

}
