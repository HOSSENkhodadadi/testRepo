package customerUtility;

public class Customer {  
	public static int customersCount = 0;

//public behind the class = visibility of the class inside or outside of the package
//Attribute Definition, you cannot access the attributes outside the class
private String firstName;
private String lastName; // you should hide as much as possible from outside
private String email;    //strings are objects you can call methods to do operation on them
		                 // java11 doc at: https://docs.oracle.com/en/java/javase/11/docs/api/index.html
private int age;
private int id;
private boolean active;// in C boolean is not available , u can use char
				// u cannot use dot notation to apply methods on
				//variables since they are not objects
				// if you create new constructor you lose the defult one
				// if you want you can define two constructors one with parameters and one without
public Customer(String firstName, String lastName, String email, int age, int id, boolean active) {
	super();
	customersCount++;
	this.firstName = firstName;
	this.lastName = lastName;
	this.email = email;
	this.age = age;
	this.id = id;
	this.active = active;
}





// an example of overloading
public Customer() {
	customersCount++;
	//this.id = -1
}

// let's overload again
public Customer(int id, String firstName, String lastName) {
	customersCount++;
	this.id = id;
	this.firstName = firstName;
	this.lastName = lastName;
}

// how can I distinguish between the parameter of the method and
// the attribute of the class
// use this to remove ambiguity
// if you don't define constructor it uses a default one
//constructor must be public
// zero for values and null for objects

public String getFirstName() {
	return this.firstName;
}
// if there is ambiguity in local variables and method parmeters and attributes of the class you should use .this
public void SetFirstName(String firstName) {
	this.firstName =firstName;
}
public boolean CompareCustomers(Customer other){
	if (this.id == other.id)
		return true;
	else
		return false;
}

public void printInfo() {
	System.out.println(firstName +" "+lastName+ " "+ email);
}

public void printInfo(String seperator) {
	System.out.println(firstName + seperator +lastName+ seperator + email);
}

}
