package com.promineotech.student.Wk3;
import java.util.*;
public class Main {
	static Scanner uI = new Scanner(System.in);
	static Product[] item = new Product[20];
	public static void main(String[] args) {
		String[] names = {};
		String[] categories = {};
		String[] subcategories = {};
		int[] upc = {};
		int[] onHand = {};
		
		//item[1]
		Product fillValve = new Product(new String[]{"fill valve"}, new String[] {"plumbing"}, new String[]{"toilet"}, new int[] {3465467}, new int[] {15});
		//item[2]
		Product flushValve = new Product(new String[]{"flush valve"}, new String[] {"plumbing"}, new String[]{"toilet"}, new int[] {54906843}, new int[] {12});
		item[1] = fillValve;
		item[2] = flushValve;
		/*
		 * for when i is less than the number of indexes in item[], we will create an item[i].
		 * item at the index of i will represent a new Product(names, categories, subcategories);
		 * 
		 * So for each time this for loop iterates, i will increment, meaning each item in the 
		 * array will have a new index.
		 */
		

		
		Menu.displayMain();
		int useInput = uI.nextInt();
		
		if (useInput > 0 && useInput <= 4) {
			if (useInput == 1) {
				Menu.callItems(item);
			}else if (useInput == 2) {
			
			}else if (useInput == 3) {
			
			}else if (useInput ==4) {
			
			}
		}
		
		for (int i = 0 ; i < item.length; i++) {
			item[i] = new Product(names, categories, subcategories, upc, onHand);
		}
		
		/* 
		 * int is a primitive datatype...\
		 * meaning it simply contains a single piece of data.
		 * 
		 * 
		 * String is an object as is an Array or any other datatype created within the codebase.
		 * Objects have properties and methods that can be accessed via
		 * dot-notation that apply to that object.
		 */
		
		//.length() is a method available to the String object `name`. Rather than building
		// our own method to find the length of name, the object can call the method using .
		// notation... .length() can not be called on int, char, boolean, etc. 
		// (primitive data types)
		
		
		// when creating Objects, they can be defined as needed. If a new object is needed,
		// there needs to be a class for that object. 
		
		// If Student has two fields: fullName and grades, a constructor named Student(), and
		// a method named describe()...
		//
		// Student needs to be a class.
		// in java a class is a template that allows an Object to be created, and each Object
		// matching that class datatype is an instance of that class. The process of creating
		// an Object from a class (instance of a class) is to "instantiate" if we use a 
		// Constructor of that class.
		
		
		//Create an array to store the objects of Item class that can store up to 20 items
		
		
		
		
		/*
		 * create a new Product object called fill valve and assign it values for each string array
		 * parameter defined by the constructor.
		 */
		
		/*
		 * add the fill valve to item[] at index 1.
		 */
		// println wont work on stand alone methods.
		// descriibe was created in the Product Class so it can only
		// be used in combination with objects of type Product.
		// I could make a new Product[] upc = new Product[20]. This
		// could contain all upc info for each item in item[]; OR 
		// upc could be added as an int[] member in the Product constructor.
		
		//item[1].describe();
		
		//item[2].describe();

	// create a new public class `Product` that will be the foundation for all `items`. 
	// if the class is not public, the class data type will not be accessible to the main class;
	// and thus, the main()
	}
}
class Product{ 
	// declare the objects that the class can return.
	// "declare the instance variables."
	private String[] names;
	private String[] cat;
	private String[] subcat;
	private int[] upc;
	private int[] onHand;
	
	
	
	
	
	// create the constructor for Item. The parameters taken into the Item method need to be
	// declared within the () so that the memory can allocate for the expected return type.
	// The Constructor initializes the object's `state`; Constructors may also contain data
	// members and member functions. The data members and member functions are executed at the
	// time of creating an object of the class.
	// Constructor needs to be named after class.
	// Constructor has no return type.
	// if there are multiple constructors in a class this is called `overloading`.
	public Product(String[] name, String[] cat, String[] subcat , int[] upc , int[] onHand) {
		//assign the value of name and cat to this class. The data collected in the constructor
		// will become the value of the objects accessible through this class.
		this.names = name;
		this.cat = cat;
		this.subcat = subcat;
		this.upc = upc;
		this.onHand = onHand;
	}
	
	
	
	
	
	
	
	
	
	
	public void describe() {
		for (int i = 0 ; i < names.length ; i++) {
			System.out.println("Product Name : " + names[i]);
			System.out.println("Product Catagory : " + cat[i]);
			System.out.println("Product SubCatagory : " + subcat[i]);
			System.out.println("Product UPC : " + upc[i]);
			System.out.println("");
			System.out.println("");
			System.out.println("Quantity on Hand : " + onHand[i]);
			
			System.out.println("");
			System.out.println("|--------------------|");
			System.out.println("");
			
		}
	}		
}


class Menu {
	
	public static void displayMain() {
		
		System.out.println("1 ) Display all items");
		System.out.println("2 ) Show on-hand inventory");
		System.out.println("3 ) Show low inventory");
		System.out.println("4 ) Exit Program");

	}
	
	
	public static void callItems(Product[] item) {
		
		for(int i = 0 ; i < item.length ; i++) {
			if(item[i]!= null) {
				item[i].describe();
			}
		}
		System.out.println("Process Finished!");
			
	}
}
