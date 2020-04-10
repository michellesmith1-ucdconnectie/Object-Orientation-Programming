public class BnbApartment extends BnbProperty {
	private int storeyNumber;
	private int noOfBeds;

	public int getStoreyNumber() {
		return storeyNumber;
	}

	public int getNoOfBeds() {
		return noOfBeds;
	}

	public void setStoreyNumber(int n) {
		storeyNumber = n;
	}

	public void setNumberOfBeds(int n) {
		noOfBeds = n;
	}

	public BnbApartment(String ownerName, String postalAddress, double rentalCostPerDay, int storeyNumber,
			int noOfBeds) {
		super(ownerName, postalAddress, rentalCostPerDay);
		this.storeyNumber = storeyNumber;
		this.noOfBeds = noOfBeds;
	}

	public BnbApartment() {

	}
}
