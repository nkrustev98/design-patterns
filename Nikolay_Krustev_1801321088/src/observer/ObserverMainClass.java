package observer;

public class ObserverMainClass {
	
public static void main(String[] args) {
		
		Reservation reservation = new Reservation();
		
		Observer obs1 = new ReservationClient(" Room reservation client 1");
		
		reservation.addReservation(obs1);
		
		
		reservation.setReservation("You have a room resrvation for 12pm today");

	}

}
