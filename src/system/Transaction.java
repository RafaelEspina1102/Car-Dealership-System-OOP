package system;

public class Transaction{

	
	void showInformation() {
		Car carInformation = new Car();
		UserInformation user = new UserInformation();
		
		user.showUserInfo();
		carInformation.get_CarInfo(null, carInformation.choice-1);
		System.out.println("Your Payment: " + carInformation._userMoney);
		System.out.println("Car price total: " + carInformation._carPrice);
		
	}
}
