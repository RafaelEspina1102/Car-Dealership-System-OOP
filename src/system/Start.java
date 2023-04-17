package system;

import java.util.Scanner;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner getAnswer = new Scanner(System.in);
		Car cars = new Car();
		UserInformation user = new UserInformation();
		Schedule schedule = new Schedule();
		
		int carStatus, whatCar;
		String carStatusChoice, repeat;
		

		do {
			String loginChoice = "Y";
			String username, password;
			
			System.out.print("Would you like to Log in? Y or N: ");
			loginChoice = getAnswer.nextLine().toUpperCase();
			if (loginChoice.equalsIgnoreCase("Y"))
			{
				System.out.println("User Login\n");
				System.out.print("Username: ");
				username = getAnswer.next();
				
				System.out.print("Password: ");
				password = getAnswer.next();
				
				user.userLogin(username, password);
			}
			else
			{
				user.creatUserLogin();
				user.getUserInfo();
				System.out.println("\nUser Login\n");
				System.out.print("Username: ");
				username = getAnswer.next();
				
				System.out.print("Password: ");
				password = getAnswer.next();
				user.userLogin(username, password);
			}
			
			System.out.println("\n\nWelcome to Rafael's Car Dealership\n");
			
			System.out.println("What status of the car would you want to buy?");
			System.out.println("1. New car\n2. Used car");
			System.out.print("Choice: ");
			carStatus = getAnswer.nextInt();
			if (carStatus == 1) {
				carStatusChoice = "New";
			}
			else {
				carStatusChoice = "Used";
			}
			
			System.out.println("\nCar brands");
			System.out.println("1. Toyota\n2.Honda\n3.Mitsubishi\n4. Ford");
			System.out.println("\nSpecific car type");
			System.out.println("5. Sedan\n6. SUV\n7. Truck\n9. Hatchback");
			System.out.println("Answer: ");
			whatCar = getAnswer.nextInt();
			System.out.println();
			
			switch(whatCar) {
			case 1: cars.set_ToyotaInfo(carStatusChoice); cars.get_CarInfo(); break;
			case 2: cars.set_HondaInfo(carStatusChoice); cars.get_CarInfo(); break;
			case 3: cars.set_MitsubishiInfo(carStatusChoice); cars.get_CarInfo(); break;
			case 4: cars.set_FordInfo(carStatusChoice); cars.get_CarInfo(); break;
			case 5: cars.set_SedanInfo(carStatusChoice); cars.get_CarInfo(); break;
			case 6: cars.set_SUVInfo(carStatusChoice); cars.get_CarInfo(); break;
			case 7: cars.set_TruckInfo(carStatusChoice); cars.get_CarInfo(); break;
			case 8: cars.set_Hatchback(carStatusChoice); cars.get_CarInfo(); break;
			}
			
			schedule.setSchedule();
			System.out.println();
			schedule.getScheudle();
			System.out.println();
			
			cars.compute();
			
			System.out.println("\nThank you for your purchase!");
			System.out.println("\nReceipt");
			user.showInformation();
			
			System.out.print("\nWould you like to buy again? Y or N: ");
			repeat = getAnswer.next();
			
			if (repeat.equalsIgnoreCase("n")) {
				break;
			}
		} while (true);
			
	}

}
