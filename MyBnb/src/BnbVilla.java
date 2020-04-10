//Author:Michelle Smith

public class BnbVilla extends BnbProperty { //Getting all the calculations from the BnbProperty File

	private double roomServiceCostPerDay;//Private Class Variables
	private double luxuryTaxPerDay;

	public double getRoomServiceCostPerDay() {//Take in the value for the RoomServiceSostPerDay
		return roomServiceCostPerDay;//Returning roomServiceCostPerDay
	}

	public double getLuxuryTaxPerDay() {//Taking in the value for the LuxuryTaxPerDay
		return luxuryTaxPerDay;//Return the LuxuryTaxPerDay
	}

	public void setRoomServiceCostPerDay(int n) {//Set the value for the RoomServiceCostPerDay in an integer 'n'
		roomServiceCostPerDay = n; //Displaying the value for RoomServiceCostPerDay that is stored in 'n'.
	}

	public void setLuxuryTaxPerDay(int n) { //Set the value for LuxuryPerDay in an integer 'n'
		luxuryTaxPerDay = n; //Displaying the value for LuxuryTaxPerDay that is stored in 'n'.
	}

	public BnbVilla(String ownerName, String postalAddress, double rentalCostPerDay, double roomServiceCostPerDay,
			double luxuryTaxPerDay) {//
		super(ownerName, postalAddress, rentalCostPerDay);//Calling the default constructor
		this.roomServiceCostPerDay = roomServiceCostPerDay;
		this.luxuryTaxPerDay = luxuryTaxPerDay;
	}

	public BnbVilla() {//Calling the function BnbVilla

	}
}
