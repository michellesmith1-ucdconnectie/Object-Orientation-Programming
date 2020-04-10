
public class BnbVilla extends BnbProperty {

	private double roomServiceCostPerDay;
	private double luxuryTaxPerDay;

	public double getRoomServiceCostPerDay() {
		return roomServiceCostPerDay;
	}

	public double getLuxuryTaxPerDay() {
		return luxuryTaxPerDay;
	}

	public void setRoomServiceCostPerDay(int n) {
		roomServiceCostPerDay = n;
	}

	public void setLuxuryTaxPerDay(int n) {
		luxuryTaxPerDay = n;
	}

	public BnbVilla(String ownerName, String postalAddress, double rentalCostPerDay, double roomServiceCostPerDay,
			double luxuryTaxPerDay) {
		super(ownerName, postalAddress, rentalCostPerDay);
		this.roomServiceCostPerDay = roomServiceCostPerDay;
		this.luxuryTaxPerDay = luxuryTaxPerDay;
	}

	public BnbVilla() {

	}
}
