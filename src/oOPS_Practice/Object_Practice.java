package oOPS_Practice;

public class Object_Practice {

	public static void main(String[] args) {
	 Human_Class object1 = new Human_Class();
	 object1.age = 29;
	 System.out.println(object1.age);
	 object1.name = "Deepak";
	 System.out.println(object1.name);
	 object1.run();
	 object1.drink();
	 object1.eat();
	 System.out.println("***********************");
	 // Second object
	 
	 Human_Class object2 = new Human_Class();
	 object2.age = 28;
	 System.out.println(object2.age);
	 object2.name = "Abhishek";
	 System.out.println(object2.name);
	 object2.run();
	 object2.drink();
	 object2.eat();
	 
	 //
	 
	 System.out.println("Age of Deepak is " + object1.age);
	 System.out.println("Age of Abhishek is " + object2.age);
	 
	 
	 // Object reference Variable Declaration
	 
	 Human_Class obj;
	 
	 obj = new Human_Class(); // object referece variable intialization
	 
	 // Whenever a class is created, a constructor is created by default. 
	 // Use is to initalize an object.
	 // Contructor is used just once in a object life cycle
	}

}
