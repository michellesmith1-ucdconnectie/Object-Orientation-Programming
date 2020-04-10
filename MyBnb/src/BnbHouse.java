//Author:Michelle Smith

public class BnbHouse extends BnbProperty { //Inheriting all the methods and fields from BnbProperty
	private int totalNumberOfStoreys;//private variables
	private double clearanceFees;

	public int getTotalNumberOfStoreys() { //Taking in the value for TotalNumberOfStorey
		return totalNumberOfStoreys;//Return the value for the TotalNumberOfStoreys
	}

	public double getClearanceFees() { //Take in the value for the ClearanceFees
		return clearanceFees;//Return ClearanceFees
	}

	public void setTotalNumberOfStoreys(int n) { //Set the value for TotalNumberOfStoreys
		totalNumberOfStoreys = n;  //Displaying value for totalNumberOfStoreys stored 'n'.
	}

	public void setClearanceFees(double d) { //Set a value for the ClearanceFees
		clearanceFees = d; //Displaying value for clearanceFees stored 'd'.
	}

	public BnbHouse(String ownerName, String postalAddress, double rentalCostPerDay, int totalNumberOfStoreys,
			double clearanceFees) { //This is an alternative constructor 
		//Calling the constructor of the Super class and passing those variables as arguments to the constructor.
		super(ownerName, postalAddress, rentalCostPerDay);
		this.totalNumberOfStoreys = totalNumberOfStoreys;  //The instance variable of the object is being assigned to totalNumberOfStoreys
		this.clearanceFees = clearanceFees; //The instance variable of the object is being assigned to clearanceFee
	}
	public BnbHouse() { //Constructor for the object

	}
}

