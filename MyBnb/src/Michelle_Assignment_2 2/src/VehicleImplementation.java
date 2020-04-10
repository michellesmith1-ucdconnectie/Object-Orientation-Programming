import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class VehicleImplementation {

	private ArrayList<BnbCar> cars = new ArrayList<BnbCar>();
	private ArrayList<BnbTruck> trucks = new ArrayList<BnbTruck>();
	private ArrayList<String> inputFile = new ArrayList<String>();
	double totalIncome = 0;

	public boolean findVehicleWithIdAndAddRentalDays(int id, int rentalDays) {
		boolean VehicleFound = false;
		for (BnbCar s : cars) {
			if (s.getUniqueRegisterNumber() == id) {
				s.setRentalDays(rentalDays);
				VehicleFound = true;
				s.incrementTotalNumberOfTransactions();
				return VehicleFound;
			}
		}
		for (BnbTruck s : trucks) {
			if (s.getUniqueRegisterNumber() == id) {
				s.setRentalDays(rentalDays);
				s.incrementTotalNumberOfTransactions();
				VehicleFound = true;
				return VehicleFound;
			}
		}
		return VehicleFound;
	}

	public void giveRentalVehicle() {
		JTextField VehicleIdStr = new JTextField();
		JTextField rentalDaysStr = new JTextField();
		Object[] message = { "VehicleID:", VehicleIdStr, "RentalDays:", rentalDaysStr };
		int VehicleId;
		int rentalDays;
		int option;
		do {
			option = JOptionPane.showConfirmDialog(null, message, "OK", JOptionPane.OK_CANCEL_OPTION);

			if (option == JOptionPane.OK_OPTION) {
				String text1 = VehicleIdStr.getText();
				String text2 = rentalDaysStr.getText();
				VehicleId = Integer.valueOf(text1);
				rentalDays = Integer.valueOf(text2);
				if (findVehicleWithIdAndAddRentalDays(VehicleId, rentalDays)) {
					System.out.println("Adding Rental days was successful.");
				} else {
					JOptionPane.showMessageDialog(null, "Vehicle was not found.");
				}
			} else {
				System.out.println("Attempt was cancelled");
			}
			VehicleIdStr.setText("");
			rentalDaysStr.setText("");
		} while (option == JOptionPane.OK_OPTION);
	}

	public void fillInVehicles() {
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("\n\nVehicleType: CAR");
			BnbCar s = new BnbCar();
			System.out.println("\nOwner's Name:");
			s.setOwnerName(scanner.nextLine());
			System.out.println("\nPostal Address:");
			s.setPostalAddress(scanner.nextLine());
			System.out.println("\nRental cost per day:");
			s.setRentalCostPerDay(Integer.parseInt(scanner.nextLine()));
			cars.add(s);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("\n\nVehicleType: HOUSES");
			BnbTruck s = new BnbTruck();
			System.out.println("\nOwner's Name:");
			s.setOwnerName(scanner.nextLine());
			System.out.println("\nPostal Address:");
			s.setPostalAddress(scanner.nextLine());
			System.out.println("\nRental cost per day:");
			s.setRentalCostPerDay(Integer.parseInt(scanner.nextLine()));
			System.out.println("\nCargo Weight:");
			s.setCargoWeight(Double.parseDouble(scanner.nextLine()));
			trucks.add(s);
		}
	}

	public void printAllVehicles() {
		// The name of the file to open.
		String fileName = "OutputVehicle.txt";

		try {
			// Assume default encoding.
			FileWriter fileWriter = new FileWriter(fileName);

			// Always wrap FileWriter in BufferedWriter.
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			// Note that write() does not automatically
			// append a newline character.
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("VehicleType: CAR");
			for (BnbCar s : cars) {
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
			}
			bufferedWriter.newLine();
			bufferedWriter.newLine();
			bufferedWriter.write("VehicleType: TRUCK");
			for (BnbTruck s : trucks) {
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
				bufferedWriter.write("Cargo Weight:" + s.getCargoWeight());
				bufferedWriter.newLine();

			}
			bufferedWriter.newLine();
			// Always close files.
			bufferedWriter.close();
		} catch (IOException ex) {
			System.out.println("Error writing to file '" + fileName + "'");
			// Or we could just do this:
			// ex.printStackTrace();
		}
	}

	public void rentVehicle() {
		Scanner scanner = new Scanner(System.in);
		for (BnbCar s : cars) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Please enter number of Rental Days of Car with Unique ID: "
						+ s.getUniqueRegisterNumber() + " :");
				s.setRentalDays(Integer.parseInt(scanner.nextLine()));
			}
		}
		for (BnbTruck s : trucks) {
			for (int i = 0; i < 3; i++) {
				System.out.println("Please enter number of Rental Days of truck with Unique ID: "
						+ s.getUniqueRegisterNumber() + " :");
				s.setRentalDays(Integer.parseInt(scanner.nextLine()));
				System.out.println("Please enter the cargo weight:");
				s.setCargoWeight(Double.parseDouble(scanner.nextLine()));
			}
		}
	}

	public double calculateTotalIncome() {
		for (BnbCar s : cars) {
			if (s.getTotalNumberOfRentalDays() > 1) {
				totalIncome = totalIncome + s.getTotalNumberOfRentalDays() * (s.getRentalCostPerDay() - 1);
			}

		}
		for (BnbTruck s : trucks) {
			if (s.getTotalNumberOfRentalDays() > 1) {
				totalIncome = totalIncome + s.getTotalNumberOfRentalDays() * (s.getRentalCostPerDay() - 1);
			}
			if (s.getTotalNumberOfRentalDays() > 0) {
				totalIncome = totalIncome + s.getCargoWeight();
			}
		}
		return totalIncome;
	}

	public VehicleImplementation() {
		this.readInputVehicleFile();
		this.giveRentalVehicle();
		this.printAllVehicles();
		System.out.println("\n================\nTotal Income from Vehicles\n================\n"
				+ this.calculateTotalIncome() + "\n================");

	}

	public void readInputVehicleFile() {

		String fileName = "InputVehicle.txt";

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
				BnbCar car = new BnbCar();
				car.setRentalCostPerDay(sc.nextInt());
				sc.next();
				car.setOwnerName(sc.next());
				car.setPostalAddress(sc.next());
				cars.add(car);
			} else if (type == 2) {
				BnbTruck truck = new BnbTruck();
				truck.setRentalCostPerDay(sc.nextInt());
				truck.setCargoWeight(sc.nextDouble());
				sc.next();
				truck.setOwnerName(sc.next());
				truck.setPostalAddress(sc.next());
				trucks.add(truck);
			}
		}
	}
}
