
public class BnbProperty implements Property {

	private static int count = 1;
	private int uniqueRegisterNumber;
	private int propertyType;
	private String ownerName;
	private String postalAddress;
	private double rentalCostPerDay;
	private int totalNumberOfRentalDays=0;
	private int totalNumberOfTransactions=0;
	public void incrementTotalNumberOfTransactions()
	{
		totalNumberOfTransactions=totalNumberOfTransactions+1;
	}
	public int getTotalNumberOfTransactions()
	{
		return totalNumberOfTransactions;
	}
	public void setPropertyType(int n)
	{
		this.propertyType=n;
	}
	public int getPropertyType()
	{
		return this.propertyType;
	}
	public int getUniqueRegisterNumber() {
		return uniqueRegisterNumber;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public String getPostalAddress() {
		return postalAddress;
	}

	public double getRentalCostPerDay() {
		return rentalCostPerDay;
	}

	public int getTotalNumberOfRentalDays() {
		return totalNumberOfRentalDays;
	}

	public void setUniqueRegisterNumber(int n) {
		uniqueRegisterNumber = n;
	}

	public void setOwnerName(String n) {
		ownerName = n;
	}

	public void setPostalAddress(String n) {
		postalAddress = n;
	}

	public void setRentalCostPerDay(double n) {
		rentalCostPerDay = n;
	}

	public void setTotalNumberOfRentalDays(int n) {
		totalNumberOfRentalDays = n;
	}

	public void setRentalDays(int n) {
		totalNumberOfRentalDays = n + totalNumberOfRentalDays;
		this.setTotalNumberOfRentalDays(totalNumberOfRentalDays);
	}

	public BnbProperty(String ownerName, String postalAddress, double rentalCostPerDay) {
		this.ownerName = ownerName;
		this.postalAddress = postalAddress;
		this.rentalCostPerDay = rentalCostPerDay;
		this.totalNumberOfRentalDays = 0;
		this.uniqueRegisterNumber = count;
		count++;

	}

	public BnbProperty() {
		this.ownerName = "";
		this.postalAddress = "";
		this.rentalCostPerDay = 0;
		this.totalNumberOfRentalDays = 0;
		this.uniqueRegisterNumber = count;
		count++;

	}
	@Override
	public void RentItem(int RentalDays) {
		this.setRentalDays(RentalDays);
		
	}
}
