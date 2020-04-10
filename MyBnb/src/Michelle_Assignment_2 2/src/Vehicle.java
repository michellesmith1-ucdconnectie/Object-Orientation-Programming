
public interface Vehicle extends RentItem{

	public int getUniqueRegisterNumber();
	public String getOwnerName();
	public String getPostalAddress();
	public double getRentalCostPerDay();
	public int getTotalNumberOfRentalDays();
	public void setUniqueRegisterNumber(int n);
	public void setOwnerName(String n);
	public void setPostalAddress(String n);
	public void setRentalCostPerDay(double n);
	public void setTotalNumberOfRentalDays(int n);
	public void setRentalDays(int n) ;
	public void incrementTotalNumberOfTransactions();
	public int getTotalNumberOfTransactions();
	public void setvehicleType(int n);
	public int getVehicleType();
}
