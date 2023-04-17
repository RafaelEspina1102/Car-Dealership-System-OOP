package system;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class UserInformation extends Transaction {
	
	// User Information
	public static  List<String> _dbUsername = new ArrayList<String>();
	public static  List<String> _dbPassword = new ArrayList<String>();
	public static List<String> _FName = new ArrayList<String>();
	public static List<String> _LName = new ArrayList<String>();
	public static List<String> _address = new ArrayList<String>();
	public static List<String> _postalCode = new ArrayList<String>();
	public static List<String> _phoneNumber = new ArrayList<String>();
	
	// Other
	public static int accountCreateIndex = _dbUsername.size() , index = 0;
	String choice = "y";
	
	// User Login
	 boolean userLogin(String Username, String Password) {
		
		for (int i = 0; i < accountCreateIndex; i++) {
			if (Username.equalsIgnoreCase(_dbUsername.get(i)) && (Password.equals(_dbPassword.get(i)))) {
				index = i;
				return true;
			}
			else {
				index = i;
				return true;
			}
		}
		return false;
	}
	
	 void creatUserLogin() {
		Scanner createUser = new Scanner(System.in);
		System.out.println("Create Account\n");
		
		
		System.out.print("Username: ");
		_dbUsername.add(createUser.next());
		
		System.out.print("Password: ");
		_dbPassword.add(createUser.next());
	}
	
	
	// Getting user Information
	 void getUserInfo() {
		Scanner infoGetter = new Scanner(System.in);
		UserInformation gettingInfo = new UserInformation();
		
		do {
			System.out.print("Enter First name: ");
			_FName.add(infoGetter.nextLine());
			
			System.out.print("Enter Last name: ");
			_LName.add(infoGetter.nextLine());
			
			System.out.print("Enter Address: ");
			_address.add(infoGetter.nextLine());
			
			System.out.print("Enter Postal Code: ");
			_postalCode.add(infoGetter.nextLine());
			
			System.out.print("Enter Phone Number: ");
			_phoneNumber.add(infoGetter.nextLine());
			
			System.out.print("Would you like to change your information? Y or N:  ");
			choice = infoGetter.next();
			
		} while (choice.equalsIgnoreCase("y"));
	}
	
	
	 public static void showUserInfo() {
		
		System.out.println("First Name: " + _FName.get(index));
		System.out.println("Address: " + _address.get(index));
		System.out.println("Postal Code: " + _postalCode.get(index));
		System.out.println("Phone Number: " + _phoneNumber.get(index));
	}

}
