//Author:Michelle Smith

import java.util.ArrayList;
import java.util.Scanner;

public class BnbMain { //The main class
	//This ArrayList allows this list be changed as different transactions are being processed
	private ArrayList<BnbHouse> houses = new ArrayList<BnbHouse>();
	private ArrayList<BnbApartment> apartments = new ArrayList<BnbApartment>();
	private ArrayList<BnbVilla> villas = new ArrayList();
	double totalIncome = 0;//The income is fixed at '0'

	public void fillInProperties() { //Calling fillProperties class
		Scanner scanner = new Scanner(System.in);//Allowing the user to enter input

		for (int i = 0; i < 3; i++) { //The loop is repeated "3 times"
			System.out.println("\n\nPropertyType: APARTMENT");//"PropertyType:Apartment" will be printed out on the console
			BnbApartment s = new BnbApartment();
			System.out.println("\nOwner's Name:");//"Owner's Name" with print out on the console
			s.setOwnerName(scanner.nextLine());//Set values for the OwnerName
			System.out.println("\nPostal Address:");//The Postal Address will appear on the console
			s.setPostalAddress(scanner.nextLine());//Set values for the Postal Address
			System.out.println("\nRental cost per day:");//This line will appear on the console
			s.setRentalCostPerDay(Integer.parseInt(scanner.nextLine()));//Set the value for RentalCostPerDay
			System.out.println("\nTotal number of beds:");//"Total number of beds" will print out on the conole.
			s.setNumberOfBeds(Integer.parseInt(scanner.nextLine()));//Set the value for the number of beds in Integers
			System.out.println("\nStorey Number:");
			s.setStoreyNumber(Integer.parseInt(scanner.nextLine()));//Set the value for StoreyNumber in integers
			apartments.add(s);
		}
		for (int i = 0; i < 3; i++) { //The loop is repeated "3 times"
			System.out.println("\n\nPropertyType: HOUSES");//"PropertyType" will print out on the console
			BnbHouse s = new BnbHouse();
			System.out.println("\nOwner's Name:");//"Owner's Name" will print out on the console
			s.setOwnerName(scanner.nextLine());//Set the value of OwnersName
			System.out.println("\nPostal Address:");
			s.setPostalAddress(scanner.nextLine());
			System.out.println("\nRental cost per day:");
			s.setRentalCostPerDay(Integer.parseInt(scanner.nextLine()));
			System.out.println("\nClearance Fees:");
			s.setClearanceFees(Double.parseDouble(scanner.nextLine()));
			System.out.println("\nNumber of Storeys:");
			s.setTotalNumberOfStoreys(Integer.parseInt(scanner.nextLine()));
			houses.add(s);
		}
		for (int i = 0; i < 3; i++) { //The loop is repeated "3 times"
			System.out.println("\n\nPropertyType: VILLAS");
			BnbVilla s = new BnbVilla(); //Creating an new string for BnbVilla
			System.out.println("\nOwner's Name:");
			s.setOwnerName(scanner.nextLine());
			System.out.println("\nPostal Address:");
			s.setPostalAddress(scanner.nextLine());
			System.out.println("\nRental cost per day:");
			s.setRentalCostPerDay(Integer.parseInt(scanner.nextLine()));
			System.out.println("\nLuxury tax per day:");
			s.setLuxuryTaxPerDay(Integer.parseInt(scanner.nextLine()));
			System.out.println("\nRoom Service Cost Per Day:");
			s.setRoomServiceCostPerDay(Integer.parseInt(scanner.nextLine()));
			villas.add(s);
		}

	}

	public void printAllProperties() {
		System.out.println("\n\nPropertyType: APARTMENT");
		for (BnbApartment s : apartments) {
			//Printing out the unique number on the console and take in the user's input and printing it out on the console
			System.out.println("\nUnique Number:" + s.getUniqueRegisterNumber());
		    System.out.println("\nOwner's Name:" + s.getOwnerName());
			System.out.println("\nPostal Address:" + s.getPostalAddress());
			System.out.println("\nRental cost per day:" + s.getRentalCostPerDay());
			System.out.println("\nTotal number of rental days:" + s.getTotalNumberOfRentalDays());
            System.out.println("\nTotal number of beds:" + s.getNoOfBeds());
			System.out.println("\nStorey Number:" + s.getStoreyNumber());

		}
		System.out.println("\n\nPropertyType: HOUSES");
		for (BnbHouse s : houses) {
			System.out.println("\nUnique Number:" + s.getUniqueRegisterNumber());
			System.out.println("\nOwner's Name:" + s.getOwnerName());
			System.out.println("\nPostal Address:" + s.getPostalAddress());
			System.out.println("\nRental cost per day:" + s.getRentalCostPerDay());
			System.out.println("\nTotal number of rental days:" + s.getTotalNumberOfRentalDays());

			System.out.println("\nClearance Fees:" + s.getClearanceFees());
			System.out.println("\nTotal number of Storeys:" + s.getTotalNumberOfStoreys());

		}
		System.out.println("\n\nPropertyType: VILLAS");//This string will be printed out on the console
		for (BnbVilla s : villas) { 
			System.out.println("\nUnique Number:" + s.getUniqueRegisterNumber());
			System.out.println("\nOwner's Name:" + s.getOwnerName());
			System.out.println("\nPostal Address:" + s.getPostalAddress());
			System.out.println("\nRental cost per day:" + s.getRentalCostPerDay());
			System.out.println("\nTotal number of rental days:" + s.getTotalNumberOfRentalDays());

			System.out.println("\nLuxury tax per day:" + s.getLuxuryTaxPerDay());
			System.out.println("\nRoom Service Cost Per Day:" + s.getRoomServiceCostPerDay());

		}
	}

	public void rentProperty() { 
		Scanner scanner = new Scanner(System.in);
		for (BnbApartment s : apartments) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Please enter number of Rental Days of Apartment with Unique ID: "
						+ s.getUniqueRegisterNumber() + " :");
				s.setRentalDays(Integer.parseInt(scanner.nextLine()));
			}
		}
		for (BnbHouse s : houses) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Please enter number of Rental Days of House with Unique ID: "
						+ s.getUniqueRegisterNumber() + " :");
				s.setRentalDays(Integer.parseInt(scanner.nextLine()));
			}
		}
		for (BnbVilla s : villas) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Please enter number of Rental Days of Villa with Unique ID: "
						+ s.getUniqueRegisterNumber() + " :");
				s.setRentalDays(Integer.parseInt(scanner.nextLine()));
			}
		}
	}

	public double calculateTotalIncome() {
		for (BnbApartment s : apartments) {
			totalIncome = totalIncome + s.getTotalNumberOfRentalDays() * s.getRentalCostPerDay();
		}
		for (BnbHouse s : houses) {
			totalIncome = totalIncome + s.getTotalNumberOfRentalDays() * s.getRentalCostPerDay() + s.getClearanceFees();
		}
		for (BnbVilla s : villas) {
			totalIncome = totalIncome + s.getTotalNumberOfRentalDays()
					* (s.getRentalCostPerDay() + s.getRentalCostPerDay() + s.getRoomServiceCostPerDay());
		}
		return totalIncome;
	}

	public static void main(String[] args) {
		BnbMain main = new BnbMain(); //Calling the 
		main.fillInProperties();
		main.rentProperty();
		main.printAllProperties();
		System.out.println("\n================\nTotal Income\n================\n" + main.calculateTotalIncome()
				+ "\n================");

	}

}
