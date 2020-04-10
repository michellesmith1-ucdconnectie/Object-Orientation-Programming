
public class BnbHouse extends BnbProperty {
	private int totalNumberOfStoreys;
	private double clearanceFees;

	public int getTotalNumberOfStoreys() {
		return totalNumberOfStoreys;
	}

	public double getClearanceFees() {
		return clearanceFees;
	}

	public void setTotalNumberOfStoreys(int n) {
		totalNumberOfStoreys = n;
	}

	public void setClearanceFees(double d) {
		clearanceFees = d;
	}

	public BnbHouse(String ownerName, String postalAddress, double rentalCostPerDay, int totalNumberOfStoreys,
			double clearanceFees) {
		super(ownerName, postalAddress, rentalCostPerDay);
		this.totalNumberOfStoreys = totalNumberOfStoreys;
		this.clearanceFees = clearanceFees;
	}
	public BnbHouse() {

	}
}
