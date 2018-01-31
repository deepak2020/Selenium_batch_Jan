package oOPS_Practice;

public class Variable_Type1 {
	
	//Static Varibale
	static String schoolName;
	
	//Instance variable
	int num;

	public static void main(String[] args) {
		
		Variable_Type1 obj1 = new Variable_Type1();
		System.out.println(obj1.schoolName);
		System.out.println(obj1.num);
		schoolName = "Dav School";
		obj1.num= 100;
		System.out.println(schoolName);
		System.out.println(obj1.num);
		System.out.println("*********************************");
		
		Variable_Type1 obj2 = new Variable_Type1();
		System.out.println(schoolName);
		System.out.println(obj2.num);
		schoolName = "Army School";
		System.out.println(schoolName);	
		
	}
	
	public void sum(){
		int a;
	}

	
}



