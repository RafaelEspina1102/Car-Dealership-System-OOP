package system;
import java.util.ArrayList;
import java.util.Scanner;

public class Schedule {
	
	ArrayList<Integer> PurchasingDate = new ArrayList<Integer>();
	ArrayList<Integer> _meetingDate = new ArrayList<Integer>();
	
	void setSchedule() {
		Scanner set_Schedule = new Scanner(System.in);
		String choice;
		
		PurchasingDate.clear();
		_meetingDate.clear();
		
		System.out.print("Would like to set up a meeting to get a better look of the car? Y or N: ");
		choice = set_Schedule.next();
		
		if (choice.equalsIgnoreCase("Y")) {
			
			System.out.print("Month (1-12): ");
			_meetingDate.add(set_Schedule.nextInt());
			System.out.print("Day (1-31): ");
			_meetingDate.add(set_Schedule.nextInt());
			_meetingDate.add(2023);
		}
		
		System.out.println("\nPlease set a date for purchase.");
		System.out.print("Month (1-12): ");
		PurchasingDate.add(set_Schedule.nextInt());
		System.out.print("Day (1-31): ");
		PurchasingDate.add(set_Schedule.nextInt());
		_meetingDate.add(2023);
		
	}
	
	void getScheudle() {
		
		 if (_meetingDate.size() > 0) {
			 System.out.print("Meeting Date: " + _meetingDate.get(0) + "/" + _meetingDate.get(1) + "/" + _meetingDate.get(2));
			 
		 } else {
			 System.out.println("Meeting Date: N/A");
		 }
		
		 System.out.print("Purchasing Date: " + PurchasingDate.get(0) + "/" + PurchasingDate.get(1) + "/" + PurchasingDate.get(2));
		 
	}
	

}
