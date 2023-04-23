// 1:06
import customerUtility.Customer;
import BookingUtility.Reservation;
import customerUtility.CustomerDB;
public class Application {
/*
 * This is a way you can insert comments on multiple
 * lines.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// when you run your program with 
		//TODO it shows it when running, as a reminder
		
		// we are not creating a variable containing object
		// we are creating a ref to object
		Customer customer1;
		customer1 = new Customer("Hossein", "Khodadadi", "hossein@live.com", 23, 1, true);
		
		System.out.println("this is an object: " +  customer1 + " end");
		
		// how compiler matches the function: uses name and data types of input
		Customer customer2;
		customer2 = customer1;// these two vars refererence/point to the same object
							 // modification are done on both of them
		 
		//System.out.println(customer1.getFirstName());// go and change it to public
		//System.out.println(customer2.getFirstName());
		customer1.SetFirstName("Davide");
		//System.out.println(customer1.getFirstName());
		
		
		// customer = customer2; customer2 will be initialized with defult constructor so since customer is an object the defult value is null
		// you are coping value to custoemr and you cannot recover it you lose the reference u just created a few lines before
		// you can have several construcotrs
		// you can have several methods with the same name, as far as something changes in the definition of method e.g. the list of parameters or their data type
		Customer c2 = new Customer("Frodo", "Baggins", "frodo.baggins@theshire.it", 32, 2, true);
		Customer c3 = c2;
		Customer c4 = new Customer("Frodo", "Baggins", "frodo.baggins@theshire.it", 32, 2, true);
		
		/*
		if (c2 == c3)
			System.out.println("c2 and c3 are the same customer");
		else 
			System.out.println("c2 and c3 are not the same customers");
		if (c3 == c4)
			System.out.println("c2 and c4 are the same customer");
		else 
			System.out.println("c2 and c4 are not the same customer");
			// since c4 and c2 are just two addresses not equal attributes
		*/
		
		
		if (c2.CompareCustomers(c4)) {
			System.out.println("c2 is equal to c4");
		}
		else
		{
			System.out.println("c2 is not equal to c4");
			
		}
		// several methods can be created by the same name
		//references are not pointers 
		
		/*
		Customer a2;
		Customer a1 = new Customer ("Frodo", "Baggins", "frodo.baggins@theshire.it", 32, 2, true);
		a2 = a1;
		a1 = null;
		a2 = null;
		System.out.println(a2.getFirstName());
		*/
		
		//because of the constructor that hasn't any input variable
		Customer c7 = new Customer();
		System.out.println(c7.getFirstName());
		System.out.println(Customer.customersCount);
		System.out.println(c7.customersCount);
		
		Customer c8 = new Customer (23, "John", "Jones");
		System.out.println(c8.getFirstName());
		
		//let us check if printInfo works
		
		c4.printInfo();
		c4.printInfo("**");
		
		c7.printInfo("/");
		c8.printInfo("&");
		//****************************************
		Reservation r1 = new Reservation (3, "Torino", 6);
		
		int [] a;
	    a = new int[10];
		String[] s = new String[5];
		System.out.println(a[4]);
		
		int [] primes = {2,3,5, 7};
		Person [] p = {new Person("john"), new Person("Susan")};
		System.out.println(p[1].getName());
		
		
		for (int i = 0; i< a.length; i++)
			a[i] = i;
		System.out.println(a[5]);
		
		Person[][] table = new Person[2][3];
		table[0][2] = new Person("Mary");
		System.out.println(table[0][2].getName());
		
		//exchanging two rows of a 2D array
		/*
		double[][] balance = new double [5][6];
		double [] temp = balance[i];
		balance[i] = balance [j];
		balance [j] = temp;
		*/
		//bidimentional array, arrays with different lengthes
		
		/* 
	 	int [][] triangle = new int [3][];
	 	for (int i = 0; i< triangle.length; i++)
	 	triangle[i] = new int[i+1]
	     */
		
		Customer [] customerArray= new Customer[2];
		customerArray[0] = c2;
		customerArray[1] = c3;
		
		for (Customer tempC: customerArray) {
			tempC.printInfo(";");
		}
		
		
		
		CustomerDB database = new CustomerDB();
		database.addCustomer("Pippo", "Pluto");
		
		database.addCustomer("Harry", "Potter");
		database.printCustomerList();
		
		////Customer [] customerArray2= {c2, c3, c4};
		
		
		//for (Customer tempC: customerArray2) {
			//tempC.printInfo(";");
		//}
		
		
	}

}
