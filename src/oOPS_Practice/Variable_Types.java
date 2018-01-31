package oOPS_Practice;

public class Variable_Types {
	
	static String b; // Class Variable or Global Variable
	
	String a; // instance variable or Object variable

	public static void main(String[] args) {
		Deepak_Default
		Variable_Types obj = new Variable_Types();
		System.out.println(obj.a);
		obj.a = "Deepak";
		System.out.println(obj.a);
		obj.b = "Abhishek420";
		System.out.println(obj.b);
		
		
		System.out.println("***************************");
		Variable_Types obj2 = new Variable_Types();
		System.out.println(obj2.a);
		obj2.a = "Ravi";
		System.out.println(obj2.a);
		System.out.println(obj2.b);
		obj2.b = "Sita";
		System.out.println(obj2.b);
		System.out.println(obj.b);
		
		
		

	}
	
	
	public void sum (){
		int c; // Local Variable
		System.out.println("I am local variable");
	}

}
