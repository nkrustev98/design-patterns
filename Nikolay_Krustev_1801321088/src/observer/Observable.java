package observer;

public interface Observable {
	
	void addReservation(Observer observer);
	void cancelReservation(Observer observer);
	
	void notifyObservers();
	
	String getUpdate();

}
