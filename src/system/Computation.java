package system;
import java.util.Scanner;

public class Computation {
	public static  int _carPrice, _tax, _userMoney,  choice = -1;
	
	void compute() {
		Car carInformation = new Car();
		Scanner getChoice = new Scanner(System.in);
		
		int change;
		
		do {
			
			System.out.print("What car would you like to buy? (1 - " + Car._price.size() + ") ");
			choice = getChoice.nextInt();
		} while (choice <= 0 | choice > carInformation._price.size());
		
		_carPrice = carInformation._price.get(choice - 1);
		
		if (_carPrice > 2000000) {
			_tax = (int)((carInformation._price.get(choice - 1) * 0.6)) ;
		}
		else if (_carPrice > 1000000) {
			_tax = (int)((carInformation._price.get(choice - 1) * 0.4)) ;
		}
		else {
			_tax = (int)((carInformation._price.get(choice - 1) * 0.2)) ;
		}
		
		_carPrice = carInformation._price.get(choice-1) + _tax;
		
		System.out.println("Your chosen car is");
		carInformation.get_CarInfo(choice-1);
		
		System.out.print("\nCar Payment\n");
		System.out.println("Total car price: " + _carPrice);
		do {
			System.out.print("Your payment: ");
			_userMoney = getChoice.nextInt();
			
			if (_userMoney < _carPrice) {
				System.out.println("Your payment is insufficient");
			}
		} while (_userMoney < _carPrice);
		
		change = _userMoney - _carPrice;
		
		System.out.print("Change: " + change);
		
		
		
		
	}
}
