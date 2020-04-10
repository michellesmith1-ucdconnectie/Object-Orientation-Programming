import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class PropertyImplementation {

	private ArrayList<BnbHouse> houses = new ArrayList<BnbHouse>();
	private ArrayList<BnbApartment> apartments = new ArrayList<BnbApartment>();
	private ArrayList<BnbVilla> villas = new ArrayList();
	private ArrayList<String> inputFile = new ArrayList<String>();
	double totalIncome = 0;

	public boolean findPropertWithIdAndAddRentalDays(int id, int rentalDays) {
		boolean propertyFound = false;
		for (BnbApartment s : apartments) {
			if (s.getUniqueRegisterNumber() == id) {
				s.setRentalDays(rentalDays);
				propertyFound = true;
				s.incrementTotalNumberOfTransactions();
				return propertyFound;
			}
		}
		for (BnbHouse s : houses) {
			if (s.getUniqueRegisterNumber() == id) {
				s.setRentalDays(rentalDays);
				s.incrementTotalNumberOfTransactions();
				propertyFound = true;
				return propertyFound;
			}
		}
		for (BnbVilla s : villas) {
			if (s.getUniqueRegisterNumber() == id) {
				s.setRentalDays(rentalDays);
				s.incrementTotalNumberOfTransactions();
				propertyFound = true;
				return propertyFound;
			}
		}
		return propertyFound;
	}

	public void giveRentalProperty() {
		JTextField propertyIdStr = new JTextField();
		JTextField rentalDaysStr = new JTextField();
		Object[] message = { "PropertyID:", propertyIdStr, "RentalDays:", rentalDaysStr };
		int propertyId;
		int rentalDays;
		int option;
		do {
			option = JOptionPane.showConfirmDialog(null, message, "OK", JOptionPane.OK_CANCEL_OPTION);

			if (option == JOptionPane.OK_OPTION) {
				String text1 = propertyIdStr.getText();
				String text2 = rentalDaysStr.getText();
				propertyId = Integer.valueOf(text1);
				rentalDays = Integer.valueOf(text2);
				if (findPropertWithIdAndAddRentalDays(propertyId, rentalDays)) {
					System.out.println("Adding Rental days was successful.");
				} else {
					JOptionPane.showMessageDialog(null, "Property was not found.");
				}
			} else {
				System.out.println("Attempt was cancelled");
			}
			propertyIdStr.setText("");
			rentalDaysStr.setText("");
		} while (option == JOptionPane.OK_OPTION);
	}

	public void fillInProperties() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\n\nPropertyType: APARTMENT");
			BnbApartment s = new BnbApartment();
			System.out.println("\nOwner's Name:");
			s.setOwnerName(scanner.nextLine());
			System.out.println("\nPostal Address:");
			s.setPostalAddress(scanner.nextLine());
			System.out.println("\nRental cost per day:");
			s.setRentalCostPerDay(Integer.parseInt(scanner.nextLine()));
			System.out.println("\nTotal number of beds:");
			s.setNumberOfBeds(Integer.parseInt(scanner.nextLine()));
			System.out.println("\nStorey Number:");
			s.setStoreyNumber(Integer.parseInt(scanner.nextLine()));
			apartments.add(s);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("\n\nPropertyType: HOUSES");
			BnbHouse s = new BnbHouse();
			System.out.println("\nOwner's Name:");
			s.setOwnerName(scanner.nextLine());
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
		for (int i = 0; i < 3; i++) {
			System.out.println("\n\nPropertyType: VILLAS");
			BnbVilla s = new BnbVilla();
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
		// The name of the file to open.
		String fileName = "OutputProperty.txt";

		try {
			// Assume default encoding.
			FileWriter fileWriter = new FileWriter(fileName);

			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Note that write() does not automatically
			// append a newline character.
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("PropertyType: APARTMENT");
			for (BnbApartment s : apartments) {
				bufferedWriter.newLine();
				bufferedWriter.newLine();
				bufferedWriter.write("Unique Number:" + s.getUniqueRegisterNumber());
				bufferedWriter.newLine();
				bufferedWriter.write("Owner's Name:" + s.getOwnerName());
				bufferedWriter.newLine();
				bufferedWriter.write("Postal Address:" + s.getPostalAddress());
				bufferedWriter.newLine();
				bufferedWriter.write("Rental cost per day:" + s.getRentalCostPerDay());
				bufferedWriter.newLine();
				bufferedWriter.write("Total number of rental days:" + s.getTotalNumberOfRentalDays());
				bufferedWriter.newLine();
				bufferedWriter.write("Total number of beds:" + s.getNoOfBeds());
				bufferedWriter.newLine();
				bufferedWriter.write("Storey Number:" + s.getStoreyNumber());
				bufferedWriter.newLine();

			}
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("PropertyType: HOUSES");
			for (BnbHouse s : houses) {
				bufferedWriter.newLine();
				bufferedWriter.write("Unique Number:" + s.getUniqueRegisterNumber());
				bufferedWriter.newLine();
				bufferedWriter.write("Owner's Name:" + s.getOwnerName());
				bufferedWriter.newLine();
				bufferedWriter.write("Postal Address:" + s.getPostalAddress());
				bufferedWriter.newLine();
				bufferedWriter.write("Rental cost per day:" + s.getRentalCostPerDay());
				bufferedWriter.newLine();
				bufferedWriter.write("Total number of rental days:" + s.getTotalNumberOfRentalDays());
				bufferedWriter.newLine();
				bufferedWriter.write("Clearance Fees:" + s.getClearanceFees());
				bufferedWriter.newLine();
				bufferedWriter.write("Total number of Storeys:" + s.getTotalNumberOfStoreys());
				bufferedWriter.newLine();

			}
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("PropertyType: VILLAS");
			for (BnbVilla s : villas) {
				bufferedWriter.newLine();
				bufferedWriter.write("Unique Number:" + s.getUniqueRegisterNumber());
				bufferedWriter.newLine();
				bufferedWriter.write("Owner's Name:" + s.getOwnerName());
				bufferedWriter.newLine();
				bufferedWriter.write("Postal Address:" + s.getPostalAddress());
				bufferedWriter.newLine();
				bufferedWriter.write("Rental cost per day:" + s.getRentalCostPerDay());
				bufferedWriter.newLine();
				bufferedWriter.write("Total number of rental days:" + s.getTotalNumberOfRentalDays());
				bufferedWriter.newLine();
				bufferedWriter.write("Luxury tax per day:" + s.getLuxuryTaxPerDay());
				bufferedWriter.newLine();
				bufferedWriter.write("Room Service Cost Per Day:" + s.getRoomServiceCostPerDay());
				bufferedWriter.newLine();

			}
			bufferedWriter.newLine();
			// bufferedWriter.write("Total income
			// :"+this.calculateTotalIncome());
			// Always close files.
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
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
			totalIncome = totalIncome + s.getTotalNumberOfRentalDays() * s.getRentalCostPerDay();
			if (s.getTotalNumberOfTransactions() > 0) {
				totalIncome = totalIncome + (s.getTotalNumberOfTransactions() * s.getClearanceFees());
			}
		}
		for (BnbVilla s : villas) {
			totalIncome = totalIncome + s.getTotalNumberOfRentalDays()
					* (s.getRentalCostPerDay() + s.getRentalCostPerDay() + s.getRoomServiceCostPerDay());
		}
		return totalIncome;
	}

	public PropertyImplementation() {
		this.readInputPropertyFile();
		this.giveRentalProperty();
		this.printAllProperties();
		System.out.println("\n================\nTotal Income from Properties\n================\n" + this.calculateTotalIncome()
				+ "\n================");

	}

	public void readInputPropertyFile() {

		String fileName = "InputProperty.txt";

		// This will reference one line at a time
		String line = null;

		try {
			// FileReader reads text files in the default encoding.
			FileReader fileReader = new FileReader(fileName);

			// Always wrap FileReader in BufferedReader.
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while ((line = bufferedReader.readLine()) != null) {
				inputFile.add(line);
			}

			// Always close files.
			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {
			System.out.println("Error reading file '" + fileName + "'");
		}

		for (String s : inputFile) {
			Scanner sc = new Scanner(s);
			int type = sc.nextInt();
			if (type == 1) {
				BnbApartment apt = new BnbApartment();
				apt.setStoreyNumber(sc.nextInt());
				apt.setNumberOfBeds(sc.nextInt());
				apt.setRentalCostPerDay(sc.nextInt());
				sc.next();
				apt.setOwnerName(sc.next());
				apt.setPostalAddress(sc.next());
				apartments.add(apt);
			} else if (type == 2) {
				BnbHouse house = new BnbHouse();
				house.setTotalNumberOfStoreys(sc.nextInt());
				house.setClearanceFees(sc.nextInt());
				house.setRentalCostPerDay(sc.nextInt());
				sc.next();
				house.setOwnerName(sc.next());
				house.setPostalAddress(sc.next());
				houses.add(house);
			} else if (type == 3) {
				BnbVilla villa = new BnbVilla();
				sc.next();
				villa.setRoomServiceCostPerDay(sc.nextInt());
				villa.setLuxuryTaxPerDay(sc.nextInt());
				villa.setRentalCostPerDay(sc.nextInt());
				sc.next();
				villa.setOwnerName(sc.next());
				villa.setPostalAddress(sc.next());
				villas.add(villa);
			}
		}
	}
}
