package observer;

import java.util.ArrayList;
import java.util.List;

public class Reservation implements Observable {
	
	private List<Observer> clients;
	private String reservation;
	
	public Reservation() {
		this.clients = new ArrayList<>();
	}

	@Override
	public void addReservation(Observer observer) {
		this.clients.add(observer);
		observer.setReservation(this);

	}

	@Override
	public void cancelReservation(Observer observer) {
		this.clients.remove(observer);

	}

	@Override
	public void notifyObservers() {
		for(Observer observer: this.clients) {
			observer.update();
		}

	}

	@Override
	public String getUpdate() {
		return this.reservation;
	}
	
	public void setReservation(String reservation) {
		this.reservation = reservation;
		this.notifyObservers();
	}

}
