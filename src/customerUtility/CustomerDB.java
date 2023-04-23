package customerUtility;

public class CustomerDB {
	private Customer [] customersArray;
	private int currentOccupation;
	final static int DB_SIZE = 100;//final: this variable cannot change
								   //the attribute is not specific of object (not depend on it)
								   //but its common to the whole class
								   // in several instances of Customer they share the same DB_SIZE
								   // property of class not object
	public CustomerDB() {
		currentOccupation = 0;
		customersArray = new Customer [DB_SIZE];
		
	}
	public void addCustomer(Customer c) {
		customersArray[currentOccupation] = c;
		currentOccupation++;
	}
	
	public void addCustomer(String firstName, String lastName) {
		customersArray[currentOccupation] = new Customer( currentOccupation,firstName,lastName);
		currentOccupation++;
		
	}
	
	public void printCustomerList() {
		for (int i = 0; i< currentOccupation; i++) {
			customersArray [i].printInfo();
		}
		
	}
}
