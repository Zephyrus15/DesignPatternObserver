package fr.mds.designpattern.observer;

public class HexadecimalObserver implements Observer{
	
	private Subject subject;

	public HexadecimalObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println("Binary String:" + Integer.toHexString(subject.getState()));
	}

}
