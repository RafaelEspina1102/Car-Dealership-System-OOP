package system;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Car extends Computation {
	
	public static ArrayList<String> _brand = new ArrayList<String>();
	public static ArrayList<String> _model = new ArrayList<String>();
	public static ArrayList<Integer> _price = new ArrayList<Integer>();
	public static ArrayList<String> _carType = new ArrayList<String>();
	public static String _status = null;
	
	
	void clearInformation() {
		_brand.clear();
		_model.clear();
		_price.clear();
		_carType.clear();

	}
	
	void set_ToyotaInfo(String status) {
		
		// Temporary storage
		ArrayList<String> sizeChecker = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		sizeChecker.clear(); temporaryPrice.clear();
		
		// Add all the model cars
		_model.add("Vios"); _model.add("Camry"); _model.add("Wigo"); _model.add("Fortuner"); _model.add("Rush");
		// Temporary storage for for loop size
		sizeChecker.add("Vios"); sizeChecker.add("Camry"); sizeChecker.add("Wigo"); sizeChecker.add("Fortuner"); sizeChecker.add("Rush");
		
		
		// Add the brand 
		for (int i = 0; i < sizeChecker.size(); i++) {
			_brand.add("Toyota");
		}
		
		// Add discount if car is used
		if (status.equalsIgnoreCase("Used"))
		{ 
			_status = "Used";
			temporaryPrice.add(1005000); temporaryPrice.add(2417000); temporaryPrice.add(705000); temporaryPrice.add(2555000); temporaryPrice.add(1176000);
			
			for (int i = 0; i < sizeChecker.size(); i ++)
			{
				if (temporaryPrice.get(i) > 2000000)
				{
					_price.add( ( (temporaryPrice.get(i) - 500000)));
				}
				else if (temporaryPrice.get(i) > 1000000)
				{
					_price.add(( (temporaryPrice.get(i) - 350000)));
				}
				else
				{
					_price.add( ( (temporaryPrice.get(i) - 200000)));
				}
			}
			
		}
		else
		{
			_status = "New";
			_price.add(1005000); _price.add(2417000); _price.add(705000); _price.add(2555000); _price.add(1176000);
		}
		
		// Add the specific car type for the car model above
		_carType.add("Sedan"); _carType.add("Sedan"); _carType.add("Hatchback"); _carType.add("SUV"); _carType.add("SUV");
	}
	
	
	void set_MitsubishiInfo (String status) {
		
		// Temporary array
		ArrayList<String> sizeChecker = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		sizeChecker.clear(); temporaryPrice.clear();
		
		//Add car model
		_model.add("Mirage"); _model.add("Xpander"); _model.add("Montero Sport"); _model.add("Strada");
		// Temporary Array for for loop size
		sizeChecker.add("Mirage"); sizeChecker.add("Xpander"); sizeChecker.add("Montero Sport"); sizeChecker.add("Strada");
		
		for (int i = 0; i < sizeChecker.size(); i++) {
			_brand.add("Mitsubishi");
			
		}

		// Add discount if the car is Used
		if (status.equalsIgnoreCase("Used"))
		{
			_status = "Used";
			temporaryPrice.add(711000); temporaryPrice.add(1068000); temporaryPrice.add(1568000); temporaryPrice.add(1048000);
			
			for (int i = 0; i < sizeChecker.size(); i ++)
			{
				if (temporaryPrice.get(i) > 2000000)
				{
					_price.add( ( (temporaryPrice.get(i) - 500000)));
				}
				else if (temporaryPrice.get(i) > 1000000)
				{
					_price.add(((temporaryPrice.get(i) - 350000)));
				}
				else
				{
					_price.add( ((temporaryPrice.get(i) - 200000)));
				}
			}
			
		}
		else
		{
			_status = "New";
			_price.add(711000); _price.add(1068000); _price.add(1568000); _price.add(1048000);
		}
		
		// Add the specific car type for the car model above
		_carType.add("Hatchback"); _carType.add("SUV"); _carType.add("SUV"); _carType.add("Truck");
	}
	
	void set_FordInfo (String status) {
		
		ArrayList<String> sizeChecker = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		sizeChecker.clear(); temporaryPrice.clear();
		
		// Add the car models
		_model.add("Next-Gen Ranger"); _model.add("Next-Gen Everest"); _model.add("Explorer"); _model.add("Next-Gen Territory");
		// temporary array for the size of the for loop
		sizeChecker.add("Next-Gen Ranger"); sizeChecker.add("Next-Gen Everest"); sizeChecker.add("Explorer"); sizeChecker.add("Next-Gen Territory");
		
		for(int i = 0; i < sizeChecker.size(); i++) {
			_brand.add("Mitsubishi");
		}
		
		// Add discount if used
		if (status.equalsIgnoreCase("Used"))
		{
			_status = "Used";
			temporaryPrice.add(1213000); temporaryPrice.add(1799000); temporaryPrice.add(3298000); temporaryPrice.add(1335000);
			
			for (int i = 0; i < sizeChecker.size(); i ++)
			{
				if (temporaryPrice.get(i) > 2000000)
				{
					_price.add( ((temporaryPrice.get(i) - 500000)));
				}
				else if (temporaryPrice.get(i) > 1000000)
				{
					_price.add(((temporaryPrice.get(i) - 350000)));
				}
				else
				{
					_price.add(((temporaryPrice.get(i) - 200000)));
				}
			}
			
		}
		else {
			_status = "New";
			_price.add(1213000); _price.add(1799000); _price.add(3298000); _price.add(1335000);
		}
		
		// Add the specific car type for the car model above
		_carType.add("Truck"); _carType.add("SUV"); _carType.add("SUV"); _carType.add("SUV");
	}
	
	void set_HondaInfo (String status) {
		
		ArrayList<String> sizeChecker = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		sizeChecker.clear(); temporaryPrice.clear();
		
		// Add the car models
		_model.add("BR-V"); _model.add("Civic"); _model.add("Accord"); _model.add("City Hatchback");
		// Temporary storage for the size of the for loop
		sizeChecker.add("BR-V"); sizeChecker.add("Civic"); sizeChecker.add("Accord"); sizeChecker.add("City Hatchback");
		
		for (int i = 0 ; i < sizeChecker.size(); i++) {
			_brand.add("Honda");
		}

		
		// Add discount if the car is used
		if (status.equalsIgnoreCase("Used"))
		{
			_status = "Used";
			temporaryPrice.add(1090000); temporaryPrice.add(1589000); temporaryPrice.add(2350000); temporaryPrice.add(1153000);
			
			for (int i = 0; i < temporaryPrice.size(); i ++)
			{
				if (temporaryPrice.get(i) > 2000000)
				{
					_price.add(( (temporaryPrice.get(i) - 500000)));
				}
				else if (temporaryPrice.get(i) > 1000000)
				{
					_price.add(((temporaryPrice.get(i) - 350000)));
				}
				else
				{
					_price.add(((temporaryPrice.get(i) - 200000)));
				}
			}
			
		}
		else {
			_status = "New";
			_price.add(1090000); _price.add(1589000); _price.add(2350000); _price.add(1153000);
		}
		
		// Add the specific car type for the car model above
		_carType.add("SUV"); _carType.add("Sedan"); _carType.add("Sedan"); _carType.add("Hatchback");
	}
	
	void set_TruckInfo (String status) {
		// Temporary Storage
		ArrayList<String> temporaryModel = new ArrayList<String>();
		ArrayList<String> temporaryBrand = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		ArrayList<String> temporaryCarType = new ArrayList<String>();
		temporaryModel.clear(); temporaryBrand.clear(); temporaryPrice.clear(); temporaryCarType.clear();
				
		// Add all Cars
		set_ToyotaInfo(status); set_HondaInfo(status); set_FordInfo(status); set_MitsubishiInfo(status);
		
		
		// Remove everything that is not a truck and transfer to a temporary storage
		for (int i = 0; i < _carType.size(); i ++) {
			if (_carType.get(i).equalsIgnoreCase("Truck")) {
				temporaryCarType.add(_carType.get(i));
				temporaryModel.add(_model.get(i));
				temporaryBrand.add(_brand.get(i));
				temporaryPrice.add(_price.get(i));
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				i = 0;
			}
			else {
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				i=0;
			}
		}
		
		clearInformation();
		
		// Transfer the information in the temporary ArrayList to the main ArrayList
		for (int i = 0 ; i < temporaryModel.size(); i ++) {
			_model.add(temporaryModel.get(i));
			_brand.add(temporaryBrand.get(i));
			_price.add(temporaryPrice.get(i));
			_carType.add(temporaryCarType.get(i));
		}
		
	}
	
	void set_SUVInfo (String status) {
		// Temporary Storage
		ArrayList<String> temporaryModel = new ArrayList<String>();
		ArrayList<String> temporaryBrand = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		ArrayList<String> temporaryCarType = new ArrayList<String>();
		temporaryModel.clear(); temporaryBrand.clear(); temporaryPrice.clear(); temporaryCarType.clear();
		
		//Set Car Information
		set_ToyotaInfo(status); set_HondaInfo(status); set_FordInfo(status); set_MitsubishiInfo(status);
		
		// Remove all information while adding SUV cars in the temporary array
		for (int i = 0; i < _carType.size(); i ++) {
			if (_carType.get(i).equalsIgnoreCase("SUV")) {
				temporaryCarType.add(_carType.get(i));
				temporaryModel.add(_model.get(i));
				temporaryBrand.add(_brand.get(i));
				temporaryPrice.add(_price.get(i));
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				i = 0;
			}
			else {
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				i=0;
			}
		}
		
		clearInformation();
		
		// Transfer the information in the temporary ArrayList to the main ArrayList
		for (int i = 0 ; i < temporaryModel.size(); i ++) {
			_model.add(temporaryModel.get(i));
			_brand.add(temporaryBrand.get(i));
			_price.add(temporaryPrice.get(i));
			_carType.add(temporaryCarType.get(i));
		}
		
	}
	
	void set_SedanInfo (String status) {
		// Temporary Storage
		ArrayList<String> temporaryModel = new ArrayList<String>();
		ArrayList<String> temporaryBrand = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		ArrayList<String> temporaryCarType = new ArrayList<String>();
		temporaryModel.clear(); temporaryBrand.clear(); temporaryPrice.clear(); temporaryCarType.clear();
		
		// Set all car Information
		set_ToyotaInfo(status); set_HondaInfo(status); set_FordInfo(status); set_MitsubishiInfo(status);
		
		// Remove all information while adding Sedan cars in the temporary array
		for (int i = 0; i < _carType.size(); i ++) {
			if (_carType.get(i).equalsIgnoreCase("Sedan")) {
				temporaryCarType.add(_carType.get(i));
				temporaryModel.add(_model.get(i));
				temporaryBrand.add(_brand.get(i));
				temporaryPrice.add(_price.get(i));
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				i = -1;
			}
			else {
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				i=-1;
			}
		}
		
		clearInformation();
		
		// Transfer the information in the temporary ArrayList to the main ArrayList
		for (int i = 0 ; i < temporaryModel.size(); i ++) {
			_model.add(temporaryModel.get(i));
			_brand.add(temporaryBrand.get(i));
			_price.add(temporaryPrice.get(i));
			_carType.add(temporaryCarType.get(i));

		}
		
	}
	
	void set_Hatchback (String status) {
		// Temporary Storage
		ArrayList<String> temporaryModel = new ArrayList<String>();
		ArrayList<String> temporaryBrand = new ArrayList<String>();
		ArrayList<Integer> temporaryPrice = new ArrayList<Integer>();
		ArrayList<String> temporaryCarType = new ArrayList<String>();
		temporaryModel.clear(); temporaryBrand.clear(); temporaryPrice.clear(); temporaryCarType.clear();
		
		// Add all car Information
		set_ToyotaInfo(status); set_HondaInfo(status); set_FordInfo(status); set_MitsubishiInfo(status);
		
		
		// Remove all information while adding Hatchback cars in the temporary arrayList
		for (int i = 0; i < _carType.size(); i ++) {
			if (_carType.get(i).equalsIgnoreCase("Hatchback")) {
				temporaryCarType.add(_carType.get(i));
				temporaryModel.add(_model.get(i));
				temporaryBrand.add(_brand.get(i));
				temporaryPrice.add(_price.get(i));
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				
				i = 0;
			}
			else {
				_model.remove(i);
				_brand.remove(i);
				_price.remove(i);
				_carType.remove(i);
				i=0;
			}
		}
		
		clearInformation();
		
		// Transfer the information in the temporary ArrayList to the main ArrayList
		for (int i = 0 ; i < temporaryModel.size(); i ++) {
			_model.add(temporaryModel.get(i));
			_brand.add(temporaryBrand.get(i));
			_price.add(temporaryPrice.get(i));
			_carType.add(temporaryCarType.get(i));
		}
		
	}
	
	// looping through car information
	void get_CarInfo() {
		
		// Loop through all the car information
		for (int i = 0; i < _brand.size(); i ++) {
			System.out.print((i+1) + ")" + "Brand: " + _brand.get(i));
			System.out.println("\t\tModel: " + _model.get(i));
			System.out.print("Car Type: " + _carType.get(i));
			System.out.println("\t\tStatus: " + _status);
			System.out.println("Manual Price: " + _price.get(i));
			System.out.println("Automatic Price: " + (_price.get(i) + 100000));
			System.out.println();
		}

		
	}
	
	// Method overloading for a specific method
	void get_CarInfo(int i) {
		
		// Loop through all the car information
			System.out.print("Brand: " + _brand.get(i));
			System.out.println("\t\tModel: " + _model.get(i));
			System.out.print("Car Type: " + _carType.get(i));
			System.out.println("\t\tStatus: " + _status);
			System.out.println("Manual Price: " + _price.get(i));
			System.out.println("Automatic Price: " + (_price.get(i) + 100000));
			System.out.println();
	}
	
	void get_CarInfo(String brand, int i) {
		System.out.println("Brand: " + _brand.get(i));
		System.out.println("Model: " + _model.get(i));
		System.out.println("Status: " + _status);
	}
	
}
