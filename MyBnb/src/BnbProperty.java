//Author:Michelle Smith

public class BnbProperty {

	private static int count = 1; //Setting the counter value to 1
	private int uniqueRegisterNumber; //Private Variables being declared in the Super Class
	private String ownerName; 
	private String postalAddress;
	private double rentalCostPerDay; 
	private static int totalNumberOfRentalDays=0; //totalNumberOfRentalDays is set at 0

	public int getUniqueRegisterNumber() { //Taking in the value for UniqueRegisterNumber
		return uniqueRegisterNumber; //Return the value for the uniqeRegisterNumber
	}

	public String getOwnerName() { //Taking in the value for OwnerName
		return ownerName; //Return the value for ownerName
	}

	public String getPostalAddress() { //Taking in the value for the PostalAddress
		return postalAddress;
	}

	public double getRentalCostPerDay() { //Take in the value for the RentalCostPerDay
		return rentalCostPerDay;//Return the RentlCostPerDay
	}

	public int getTotalNumberOfRentalDays() { //Take in the value for the TotalNumberOfRentals
		return totalNumberOfRentalDays; //Return the TotalNumberOfRentalsDays
	}

	public void setUniqueRegisterNumber(int n) { //Set a value for an uniqueRegisterNumber in integers
		uniqueRegisterNumber = n;//Set uniqueRegisterNumber to 'n'.
	}

	public void setOwnerName(String n) { //Set the value for the OwnerName in a string type
		ownerName = n; //Set ownerName to 'n'.
	}

	public void setPostalAddress(String n) { //Set the value for the PostalAddress in a string type
		postalAddress = n; //postalAddress to 'n'.
	}

	public void setRentalCostPerDay(double n) { //Set the value for the RentalCostPerDay 
		rentalCostPerDay = n; //Set rentalCostPerDay to 'n'.
	}

	public void setTotalNumberOfRentalDays(int n) { //Set the value for the TotalNumberOfRentalDays
		totalNumberOfRentalDays = n; //Set totalNumberOfRentalDay to 'n'.
	}

	public void setRentalDays(int n) { //Set the value for the RentalDays
		totalNumberOfRentalDays = n + totalNumberOfRentalDays; //Update totalNumberOfRentalDays.
	}

	public BnbProperty(String ownerName, String postalAddress, double rentalCostPerDay) {
		this.ownerName = ownerName; //"ownerName'
		this.postalAddress = postalAddress; //"postalAddress"
		this.rentalCostPerDay = rentalCostPerDay; //"rentalCostPerDay"
		this.totalNumberOfRentalDays = 0;//initalises RentalDays to '0'
		this.uniqueRegisterNumber = count;//
		count++; 

	}

	public BnbProperty() {
		this.ownerName = ""; // "ownerName"
		this.postalAddress = "";//"postalAddress"
		this.rentalCostPerDay = 0; //"rentalCostPerDay"
		this.totalNumberOfRentalDays = 0;//"totalNumberOfRentalDays" 
		this.uniqueRegisterNumber = count;//"uniqueRegisterNumber"
		count++;

	}
}

