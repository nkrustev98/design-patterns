package observer;

public class ReservationClient implements Observer {
	
	private String name;
	private Observable reservation;
	
	public ReservationClient(String name) {
		this.name = name;
	}

	@Override
	public void update() {
		if(this.reservation == null) {
			System.out.println(this.getName() + " has no reservation set ");
			return;
		}
		
		String newReservation = this.reservation.getUpdate();
		System.out.println(this.getName() + " received an update: " + newReservation);

	}
	
	public String getName() {
		return name;
	}

	@Override
	public void setReservation(Observable reservation) {
		this.reservation = reservation;

	}

}
