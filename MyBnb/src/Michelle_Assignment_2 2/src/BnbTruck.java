
public class BnbTruck extends BnbVehicle{
	double cargoWeight;
	public double getCargoWeight()
	{
		return this.cargoWeight;
	}
	public void setCargoWeight(double n)
	{
		this.cargoWeight=n;
	}
	public BnbTruck(String ownerName, String postalAddress, double rentalCostPerDay, double cargoWeight) {
		super(ownerName, postalAddress, rentalCostPerDay);
		this.cargoWeight=cargoWeight;
	}

	public BnbTruck() {
	}

}
