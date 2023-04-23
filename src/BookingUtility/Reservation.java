package BookingUtility;

public class Reservation {
	private int id;
	private String location;
	private int duration; // Num days
	private String startDate;
	private String endDate;
	private float cost;
	
	public Reservation(int id, String location, int duration, String startDate, String endDate, float cost) {
		super();
		this.id = id;
		this.location = location;
		this.duration = duration;
		this.startDate = startDate;
		this.endDate = endDate;
		this.cost = cost;
	}

	public Reservation(int id, String location, float cost ) {
		super();
		this.id = id;
		this.location = location;
		this.cost = cost;
	}
	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		if (location == "Moon")
			System.out.println("dude it should be on earth!");
		this.location = location;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float cost) {
		this.cost = cost;
	}
	

}
